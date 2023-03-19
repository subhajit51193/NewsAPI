
# News APP

This is a very basic test application.
It consumes news api from https://newsapi.org/ and returns json values for the client end. Then by using AppScript it calls the api everyday at the same time so that user can get top 5 news details on their Telegram by a bot.


## Features

- Users can get top 5 news everyday with link on telegram


## API Reference

#### 

```
  https://newsapi.org/
```


## Optimizations

NA


## Deployment

This project is deployed on Railway Cloud currently

```bash
  https://newsapi-production-04d6.up.railway.app/getNews
```


## Installation

Install main file after that create new google sheet and link AppScript with below code so that we can get all the news API in google sheet.

```bash
  function myFunction() {
  var url = "https://newsapi-production-04d6.up.railway.app/getNews";
  var response = UrlFetchApp.fetch(url);
  var json = response.getContentText();
  var apidata = JSON.parse(json);
  

  var cursheet = SpreadsheetApp.getActiveSheet();
  cursheet.clear();
  var headerRow = ['author','title','description','url','urlToImage','publishedAt','content'];
  cursheet.appendRow(headerRow);

  for (var i=0;i<5;i++){
     var row = [apidata.articles[i].author,apidata.articles[i].title,apidata.articles[i].description,apidata.articles[i].url,apidata.articles[i].urlToImage,apidata.articles[i].publishedAt,apidata.articles[i].content];
     SpreadsheetApp.getActiveSheet().appendRow(row);
  }
  
}
```
   Now we have the API for top 5 news. No we can create new bot from Telegram and add a button so that upon clicking it it can share all the news with us.
   My Ref- https://www.youtube.com/watch?v=wurbOxEo_rI
## Demo

Insert gif or link to demo


## Tech Stack

**Client:** Java, SpringBoot,AppScript

**Server:** Embedded


## Authors

- [Subhajit Saha](https://github.com/subhajit51193)


## Feedback

If you have any feedback, please reach out to us at nnorth87@gmail.com


## 🔗 Links
[![portfolio](https://img.shields.io/badge/my_portfolio-000?style=for-the-badge&logo=ko-fi&logoColor=white)](https://subhajit51193.github.io/)
[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/subhajit-saha-103110185/)
