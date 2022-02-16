import { HttpClient } from '@angular/common/http';
import { Inject, Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Result } from './model/result';

@Injectable({
  providedIn: 'root'
})
export class GbsuFtbLaiService {
  constructor(private http: HttpClient, @Inject('SERVER_URL') private apiURL:string) { }

  convertNumber(inputNumber: number): Observable<Result> {
    return this.http.get<Result>(this.apiURL + `/gbsu-ftb-lai/${inputNumber}`);
  }
}
