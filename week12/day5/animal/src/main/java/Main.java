import controller.AnimalController;
import controller.HumanController;
import entity.Human;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("context.xml");
//        AnimalController animalController= classPathXmlApplicationContext.getBean("animalController", AnimalController.class);
//        animalController.start();


        HumanController humanController = classPathXmlApplicationContext.getBean("humanController", HumanController.class);
        humanController.start();
    }
}
