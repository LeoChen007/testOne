package service;
import javax.ejb.Remote;


@Remote
public interface Hello {
    String sayHello();
}
