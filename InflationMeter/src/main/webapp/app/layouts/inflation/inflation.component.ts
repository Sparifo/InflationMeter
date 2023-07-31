import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'jhi-inflation',
  templateUrl: './inflation.component.html',
  styleUrls: ['./inflation.component.scss']
})
export class InflationComponent implements OnInit {

  constructor() { var request = require('request');
  var options = {
    'method': 'GET',
    'url': 'localhost:8080/api/products/name',
    'headers': {
      'Authorization': 'Basic YWRtaW46YWRtaW4='
    }
  };
  request(options, function (error, response) {
    if (error) throw new Error(error);
    console.log(response.body);
  });
}

  ngOnInit(): void {
  }

}
