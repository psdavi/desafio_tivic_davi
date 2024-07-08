import { Component } from '@angular/core';
import { OcorrenciaService } from '../services/ocorrencia.service';
import { OcorrenciaRequestDTO } from '../models/ocorrencia-request-dto';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';


@Component({
  selector: 'app-ocorrencia',
  templateUrl: './ocorrencia.component.html',
 // styleUrls: ['./ocorrencia.component.css']
})
export class OcorrenciaComponent {
  ocorrenciaForm: FormGroup;

  constructor(
    private ocorrenciaService: OcorrenciaService,
    private fb: FormBuilder
  ) {
    this.ocorrenciaForm = this.fb.group({
      nome: ['', Validators.required],
      descricao: [0, Validators.required]
    });
  }

  onSubmit() {
    if (this.ocorrenciaForm.valid) {
      const ocorrencia: OcorrenciaRequestDTO = this.ocorrenciaForm.value;
      this.ocorrenciaService.createOcorrencia(ocorrencia).subscribe(
        response => {
          console.log('Ocorrência cadastrada com sucesso!', response);
        },
        error => {
          console.error('Erro ao cadastrar ocorrência:', error);
        }
      );
    }
  }
}

