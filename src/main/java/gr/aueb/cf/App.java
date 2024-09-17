package gr.aueb.cf;

import gr.aueb.cf.model.Course;
import gr.aueb.cf.model.Teacher;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev6PU");
        EntityManager em = emf.createEntityManager();


        em.getTransaction().begin();


//        List<Teacher> teachers = em.createQuery("SELECT t FROM Teacher  t", Teacher.class).getResultList();
//        teachers.forEach(System.out::println);
//
//        List<Object[]> BobCourses = em.createQuery("SELECT t FROM Teacher t join t.courses c WHERE c.title LIKE :course", Object[].class)
//                .setParameter("course", "Py%").getResultList();
//        for(Object[] bobCourse : BobCourses) {
//            for(Object course : bobCourse) {
//                System.out.println(course);
//            }
//            System.out.println();
//        }

//
//        TypedQuery<Teacher> query = em.createQuery("SELECT t FROM Teacher t WHERE t.firstname = :firstname", Teacher.class)
//                .setParameter("firstname", "Bob");
//                Teacher teacher = query.getSingleResult();
//
//        System.out.println(teacher);


//        Teacher bob = new Teacher(null,"Bob","sponbob",null);//ftiaxno ena teacher sthn bash kai ftixnei kai thn bash mazi
//        Course python = new Course(null,"Python",null);
//        Course Csharp = new Course(null,"Csharp",null);
//        em.persist(bob);
//        em.persist(python);
//        em.persist(Csharp);


//        Teacher alice = new Teacher(null, "Alice", "W.", null);
//        Course java = new Course(null, "Java Programming", null);
//        alice.addCourse(java);
//
//        em.persist(alice);
//        em.persist(java);

        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
