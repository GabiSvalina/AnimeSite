/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zavrsni.animesite.controller;

import java.util.List;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import org.hibernate.Session;
import zavrsni.animesite.model.Entitet;
import zavrsni.animesite.util.AnimeException;
import zavrsni.animesite.util.HibernateUtil;

public abstract class Obrada<T extends Entitet>{

    protected T entitet;
    protected Session session;
    protected Validator validator;
    
    public abstract List<T> getPodaci();
    protected abstract void kontrolaCreate() throws AnimeException;
    protected abstract void kontrolaUpdate() throws AnimeException;
    protected abstract void kontrolaDelete() throws AnimeException;
    
    public Obrada() {
        this.session = HibernateUtil.getSession();
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        this.validator = factory.getValidator();
    }
    
    public Obrada(T entitet){
        this();
        this.entitet=entitet;
    }
    
    public T create() throws AnimeException{
        kontrola();
        kontrolaCreate();
        save();
        return this.entitet;
    }
    
    public T update() throws AnimeException{
        kontrola();
        kontrolaUpdate();            
        save();
        return this.entitet;
    }
    
    public boolean delete() throws AnimeException{
        kontrolaDelete();
        session.beginTransaction();
        session.delete(this.entitet);
        session.getTransaction().commit();
        return true;
    } 
    
    private void save(){
        session.beginTransaction();
        session.save(this.entitet);
        session.getTransaction().commit();
    }
    
    public T getEntitet() {
        return entitet;
    }

    public void setEntitet(T entitet) {
        this.entitet = entitet;
    }

    private void kontrola() throws AnimeException{
        Set<ConstraintViolation<T>> constraintViolations = validator.validate(this.entitet);
        
        if(constraintViolations.size()>0){
            StringBuilder sb = new StringBuilder();
            for (ConstraintViolation<T> violation : constraintViolations) {
                System.out.println(violation.getMessage());
                
            sb.append(violation.getMessage());
            sb.append(", ");
            }
            
            throw new AnimeException(sb.toString());
        }
    }
}
