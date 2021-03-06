# Traveling Salesman Problem with Drone

This repository is meant for publishing some of our code related to the traveling salesman problem with drone, or TSP-D.

Currently, this repository contains a couple of modules:
* The `tsp-drones-core` module contains classes that can be used to work with, read and/or write instances, solutions and images of the problem.
* The `tsp-drones-heur` module contains classes related to the heuristics discussed in the paper *Optimization Approaches for the Traveling Salesman Problem with Drone*.
* The `tsp-drones-mip` module contains classes related to the exact Integer Programming solution discussed in the same paper. In order to compile this you need to have *IBM ILOG CPLEX Optimization Studio V12.6.3* installed and the appropriate `CPLEX_STUDIO_DIR1263` environment variable must be set.
* The `tsp-drones-generate` module contains a [Spring Shell](https://projects.spring.io/spring-shell/) based command line utility that can be used to generate instances.

In the future we aim to publish more modules as new solution approaches are developed. If time allows a second command line utility to run the solvers will be provided. As of now, it is still necessary to write your own code to call our solvers, so all modules except the `tsp-drones-generate` module must be considered as a library. 

# Papers and References

In case you use this software for research purposes, it is appreciated if you provide a citation of the following paper:

N.A.H. Agatz, P.C. Bouman & M.E. Schmidt. Optimization Approaches for the Traveling Salesman Problem with Drone. Transportation Science. https://doi.org/10.1287/trsc.2017.0791

Instances used during our research can be found in a separate repository: https://github.com/pcbouman-eur/TSP-D-Instances

# Building Instructions

In order to build the code yourself, make sure you have a JDK version that can handle Java 8 and a you have a modern enough version of Maven installed. You can then clone this repository and execute the following command in the root of the cloned repository. The necessary steps on the command line are as follows:
```
git clone https://github.com/pcbouman-eur/Drones-TSP.git
cd Drones-TSP
mvn package
```
This will download the necessary dependencies and run a couple of unit tests and, if succesful, package the modules as jar files. The results can be found in the `target` directories of the individual modules. By default, the `tsp-drones-mip` module is not enabled by default. If you want to compile that as well, use
```
mvn package -P all
```

Note that the `tsp-drones-mip` module requires an installed version of the IBM ILOG CPLEX Optimization Studio V12.6.3.
