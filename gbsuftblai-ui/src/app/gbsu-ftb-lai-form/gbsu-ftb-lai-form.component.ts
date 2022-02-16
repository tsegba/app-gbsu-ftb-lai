import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-gbsu-ftb-lai-form',
  templateUrl: './gbsu-ftb-lai-form.component.html'
})
export class GbsuFtbLaiFormComponent implements OnInit {
  myForm: FormGroup;

  @Output()
  submitNumberOutput = new EventEmitter<number>();

  constructor(private fb: FormBuilder) {

  }

  ngOnInit(): void {
    this.myForm = this.fb.group({
      inputNumber:''
    });
  }

  submitNumber(form: FormGroup): void {
    ;
    this.submitNumberOutput.emit(+form.value.inputNumber);
  }

}
