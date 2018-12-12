# Seattle Java 401d2 Week 3 Lab
This is a simple web site which uses a backend written in Java. The site has /hello, /capitalize/{word}, /reverse?sentence={sentence to reverse}, and /albums pages. The albums page utilizes data stored within a Postgres database, which can be added to either using the form on the page or performing a POST to the /albums path.

# Setup and Running
After cloning down the repo, be sure to add a application.properties file within src/main/resources. Refer to the [demoApplication.properties](src/main/resources/demoApplication.properties) file for an example of what is necessary to setup the app to work with a database. The app can be run running `./gradlew bootRun` in the terminal.

# Change Log
## 12/11
* 9:00AM - Repo Created
* 9:30AM - /hello route added
* 10:00AM - /capitalize route added
* 11:30AM - /reverse route added

## 12/12
* 9:15AM - Album class and /albums GET route added
* 10:00AM - rendering album data onto albumsIndex.html
* 11:00AM - Postgres database intergration
* 12:00PM - /albums POST route and form on albumIndex.html added
