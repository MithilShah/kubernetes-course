import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { HttpClient } from '@angular/common/http';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  helloForm: FormGroup;
  title = 'kubernetes-angular';
  message = ''

  constructor(private http: HttpClient, private fb: FormBuilder) {

  }

  ngOnInit() {
    this.helloForm = this.fb.group(
      {
        name: ['', Validators.required]
      }
    );
  }

  onSubmit({ value }: { value: HelloName }) {
    return this.http.request('get', 'http://localhost:8080/hello?name=' + value.name, { responseType: 'text' }).
      subscribe(output => {
        console.log(output)
        this.message = "Message from backend : " + output;
      },
        error => {
          console.log(error);
          this.message = error;
        })
  }
}

export interface HelloName {
  name: string;
}
