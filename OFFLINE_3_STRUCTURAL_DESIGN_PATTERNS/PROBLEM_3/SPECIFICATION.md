Suppose that there are two types of personnel in a **Software Company** including **Project
Manager** and **Developer**. A project manager leads and manages a group of developers to
complete a software project. On the other hand, a developer applies technical knowledge and skill
to implement a software product.

At a certain time, a software company can run multiple projects. But, project managers as well as
developers are obliged to take part in a single project at a time. A software company is
characterized by its name and total number of running projects. On the other hand, both a project
manager and a developer are characterized by their name, role (either project manager or
developer), and name of the project they are currently working on. Besides, **a project manager
keeps a list of developers working under his/her supervision in a project**. Likewise, **the software
company keeps a list of currently running projects and their managers**.
Now, implement the above scenario by writing necessary classes and using appropriate design
pattern. **Each component class must contain a method to show the details about an instance of
that class. Also, each composite class must contain a method to show the hierarchy under an
instance of that composite class.** You may consider the following examples.

|manager_component.details():|company_composite.hierarchy():|
|-|-|
|Name: Alan Turing
Role: Project Manager
Current Project: CSE308
Number of Supervisees: 2|
- Manhattan Company
  - Alan Turing (CSE308)
    - Robert Oppenheimer
    - John von Neumann
  - David Patterson (CSE307)
    - Alfred Aho|

You need to take input from the user, using the console, as required. Also, you need to create and
remove an instance of any component class by strictly following the hierarchy. For example, in
order to create a developer, you need to create a software company followed by a project
manager first. Likewise, in order to remove a software company, you need to remove all the
developers followed by all the project managers working in that company first.

