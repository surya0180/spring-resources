What is spring container:

Manages spring beans and its lifecycle
there are 2 types of spring container
1. Bean Factory = Very basic spring container
2. Application Context = A bit advanced spring container with enterprise features. ( Mostly used one ).

----------------------

Java Bean vs POJO vs Spring Bean

POJO = Plain old java object/ Any java object is a POJO
Java Bean = Enterprise Java Beans (Not popular now). Three restrictions. 1. No Arg Constructor, 2. Should have getters
and setters, 3. should implement serializable interface
Spring Bean = POJO's that are manages by spring framework

----------------------

What if there are multiple beans with same identifier?

we use @Primary annotation to avoid conflicts. It is kind of giving priority to one over other

-----------------------

Using annotations like @Component and @ComponentScan, spring is able to not only auto wire the objects but also create
those objects for us in the spring container.

-----------------------

@Primary has the highest preference in case of conflicting bean types
@Qualifier can be used to give it a qualifying name. and when that name is specified at the time of auto-wiring, that
bean will be given preference.

------------------------

Dependency Injection - Identify beans and their dependencies and wire them together ( provides IOC-Inversion of control)

1. Constructor Based *Recommended by spring team*
    Creating a constructor will all the dependencies will automatically use the constructor to create the object
    even without autowired.
2. Setter Based
    If we put @Autowired for the setter methods of fields in a class, the fields will be created. This is called
    setter based injection
3. Field Based
    As soon as you put @Autowired to a field of a class, spring is going to wire it to its respective class. This is
    called field based dependency injection.

--------------------------

Annotations used so far:

1. @Component = An instance of class ( Spring Bean ) will be managed by spring framework.
2. @ComponentScan = Used to find all the components or instances that spring is going to handle by creating beans.
                    Current package and sub packages will be scanned for components.
3. @Configuration = Used to create a Configuration file where we can create all our beans which are managed by the
                    spring container
4. @Bean = Used to create a bean
5. @Autowired = Used to wire dependencies to a bean.
6. @Primary = Used to specify the top preference to the bean
7. @Qualifier = Used to specify the preference for the bean.

---------------------------

Lazy initialisation

By default spring beans are initialised eagerly, which means when the component scan happens, then and there itself.
With @Lazy annotation, we can initialise a spring bean only when we require it to be initialised.

But nevertheless, Eager initialisation is always recommended. @Lazy is used very less frequently. In case of very
complex initialisation that can delay the app startup, we can do the lazy initialisation.

---------------------------

Bean Scopes

Singleton: One object instance  per spring IOC container
Prototype: Possibly many object instances per Spring IOC container
scopes applicable for only web aware Spring ApplicationContext
Java Singleton vs Spring Singleton

-----------------------------

Post Construct And Pre Destroy

Post Construct is used to run some logic just after the mean is initialised in the spring container.
Pre destroy is used to run some logic after the bean is deleted from the container

------------------------------