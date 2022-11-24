package com.masai;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
public class Demo {
    public static void main(String[] args){

        EntityManagerFactory emf= Persistence.createEntityManagerFactory("productUnit");
        EntityManager em= emf.createEntityManager();
        Product prod= em.find(Product.class, 20);
        if(prod != null) System.out.println(prod);
        else
            System.out.println("Product does not exist");
        em.close();

    }
}
