# Spring-Data-JPA-Rest-DemoApp


## How to reduce boilerplate code in REST API : Spring Data REST’. In Spring Data REST concept we don’t have to write even RestController and it’s methods. Spring Data REST dependency will take care of it using HATEOAS(Hypertext as the Engine of Application State)

## HATEOAS project is a library of APIs that we can use to easily create REST representations. Spring Data REST provides hyperlinks to access REST operations with the help of HATEOAS only. When some details of a resource are requested, you will provide the resource details as well as details of related resources and the possible actions you can perform on the resource. HATEOAS provides us this type of details. You might have guessed that we will learn Spring Data REST concept using Spring Boot only.

## What is Spring Data REST ?
## Spring Data REST is a concept which minimizes a lot of manual work and provides basic implementation of CRUD functionality quite easy. It is built on top of Spring Data Project and also comes under the umbrella Spring Data Project.
 
## Where can we use Spring Data REST Concept ?
## The applications which require only CRUD operations, we can use this concept to generate REST API and get rid of boilerplate codes. As mentioned earlier using this concept we can reduce not only the boilerplate code but also get rid of memorizing the annotations at Controller and method levels.

## How to test the created REST API using Spring Data REST ?
## Step #1 : Run the created Spring Boot Starter Project
## To run the application right click on Project and select Run As >> Spring Boot App.

## Step #2 : Enter the URL as http://localhost:8080/ into Browser.
## Once you enter the above URL and click enter, you will see the the below output.
```
localhost:8080/
{
    _links: {
        invoices: {
           href: "http://localhost:8080/invoices"
            },
     profile: {
           href: "http://localhost:8080/profile"
          }
      }
}
```