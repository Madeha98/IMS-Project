Coverage: 77.6%
# IMS-Project

This inventory management system (IMS) project encapsulates the core modules of the training, involving Agile & Project Management, Databases, Cloud Fundamentals, Programming Fundamentals. I created a Java application that interacts with a MySQL database and can be interacted with via a CLI, including CRUD functionalities

## Getting Started

The link to the GitHub project repository is below:
https://github.com/Madeha98/IMS-Project

### Prerequisites

The software used for this application can be installed by clicking the links below:


[Java SE Development Kit](https://www.oracle.com/java/technologies/downloads/)

[MySQL Workbench](https://dev.mysql.com/downloads/windows/installer/8.0.html)

[Maven](https://maven.apache.org/download.cgi)

[JUnit](https://junit.org/junit5/)

[GitBash](https://git-scm.com/)

[Eclipse](https://eclipse.org/downloads/)



### Installing

How to open the project in the Eclipse IDE:

Once the required software has been installed, open a GitBash terminal in desired directory. Copy and paste the command below into the terminal then hit enter.

```
$ git clone git@github.com:Madeha98/IMS-Project.git
```
The new folder in your working directory can be opened in Eclipse by clicking "File" and "Open Projects...".

## Running the tests

Automated tests can be run in the Eclipse IDE. Right-click the desired file/folder, select "Coverage As" and "JUnit Test". This will begin the testing and display the outcome.

### Unit Tests 

Unit testing is a software testing method that involves analysing individual sections of an application (units). This tests a consstructor of the "Item" class.

```
@Test
	public void oneConstructor() {
		Item = new Item(id, Name, price);
	}
```

### Integration Tests 
Integration testing involves testing combined software modules as a group. This tests CRUD functionality of "Item" and the database connection.

```
@Test
	public void testUpdate() {
		Item item = new Item(1L, "Jumper", (double)400.99);

		Mockito.when(this.utils.getLong()).thenReturn(1L);
		Mockito.when(this.utils.getString()).thenReturn(item.getName());
		Mockito.when(this.utils.getDouble()).thenReturn(item.getPrice());
		Mockito.when(this.DAO.update(item)).thenReturn(item);

		assertEquals(item, this.controller.update());

		Mockito.verify(this.utils, Mockito.times(1)).getLong();
		Mockito.verify(this.utils, Mockito.times(1)).getString();
		Mockito.verify(this.utils, Mockito.times(1)).getDouble();
		Mockito.verify(this.DAO, Mockito.times(1)).update(item);
	}
```

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management

## Versioning

We use [SemVer](http://semver.org/) for versioning.

## Authors

* **Chris Perrins** - *Initial work* - [christophperrins](https://github.com/christophperrins)
* **Madeha Rawshon** - *Completed work* - [Madeha98](https://github.com/Madeha98)

## License

This project is licensed under the MIT license - see the [LICENSE.md](LICENSE.md) file for details 

*For help in [Choosing a license](https://choosealicense.com/)*

## Acknowledgments

* A thank you to my course trainers and team for the learning support for this IMS project.
