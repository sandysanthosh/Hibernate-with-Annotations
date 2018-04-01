Welcome to the Hibernate-with-Annotations wiki!


hibernate annotaion:
java.persistance.*;

no need to create mapping()hbm file

@Entity
@Id
@Table
@column
 
in pojo class have to specity the id compulsary


pojo class:

@Entity
@Table(name="employee")
public class Employee{
@Id
private int id;
private string name;


in hibernatte cfg.xml:
when we use annotaion we should annotaion configuration in session factory

SessionFactory sf =  new AnnotationConfiguration().configure("hibernate.cfg.xml").buildSessionFactory();


to see the query:

we should use 

<property type="show_sql"> true</property>

