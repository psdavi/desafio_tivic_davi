import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { OcorrenciaRequestDTO } from '../models/ocorrencia-request-dto';

@Injectable({
  providedIn: 'root'
})
export class OcorrenciaService {
  private apiUrl = 'http://localhost:8080/ocorrencia';

  constructor(private http: HttpClient) { }

  createOcorrencia(ocorrencia: OcorrenciaRequestDTO): Observable<any> {
    return this.http.post(this.apiUrl, ocorrencia);
  }
}