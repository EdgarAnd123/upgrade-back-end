## Endpoints

### Get All
```
GET | http://localhost:8081/countries
```

### Get By Id
```
GET | http://localhost:8081/country/2
```

### Save
```
POST | http://localhost:8081/saveCountry
{
    "id": 5,
    "name": "España",
    "capital": "Madrid",
    "population": 47350000,
    "continent": "Europe",
    "flag": null,
    "language": 1
}
```

### Update
```
PUT | http://localhost:8081/saveCountry
{
    "id": 1,
    "name": "Mexico",
    "capital": "CDMX",
    "population": 128900000,
    "continent": "America",
    "flag": null,
    "language": 1
}
```

### Delete
```
DELETE | http://localhost:8081/country/4
```

### Download Image
```
GET | http://localhost:8081/downloadImage
```

### Build Design Pattern
```
GET | http://localhost:8081/continent/america
```

## Commands
### Git
```
Create Branch (“test”):
 - git branch <branch-name>
 - git checkout -b <branch-name> (Switches you and creates the branch if doesn't exist)
 	- git checkout -b table-component

Add new File to branch
 - git add <name-file>
 	- git add index.html

Commit branch to Master 
 - git commit -m <message>
	- git commit -m "My first commit"
```

### Docker
```
Run docker Continer
-docker run -it --name="myContainer" <image> /bin/bash

Create file (“test.txt”) in Continer
 - echo "Sample text" > test.txt 

Create image "Test"
 - docker commit -m="Test text" myContainer Test

Add Tag "myTest" to image
 - docker tag Test:MyTag EdgarAnd123/Test
```
