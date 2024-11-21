# Customer Loans

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
[![Licence](https://img.shields.io/github/license/Ileriayo/markdown-badges?style=for-the-badge)](./LICENSE)

This project is an API built using **Java and Java Spring**, to solution this challenge: https://github.com/backend-br/desafios/blob/master/loans/PROBLEM.md


## Table of Contents

- [Installation](#installation)
- [Usage](#usage)
- [API Endpoints](#api-endpoints)

## Installation

1. Clone the repository:

```bash
git clone https://github.com/Lucas-barreto1/customer-loans.git
```

2. Install dependencies with Maven


## Usage

1. Start the application with Maven
2. The API will be accessible at http://localhost:8080

## API Endpoints
The API provides the following endpoints:

**SEND Customer Loan**
```markdown
POST /customer-loans 
```

**BODY**
***Example:***
```json
{
	"age": 22,
	"cpf": "275.484.389-23",
	"name": "Vuxaywua Zullow",
	"income": 5000.00,
	"location": "SP"
}
```


