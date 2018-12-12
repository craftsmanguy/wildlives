import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';
import { DeleteService } from './delete.service';
import { MatDialog } from '@angular/material';
import { DialogComponent } from '../dialog/dialog.component';

@Component({
  selector: 'app-delete',
  templateUrl: './delete.component.html',
  styleUrls: ['./delete.component.css'],
  providers: [DeleteService]
})
export class DeleteComponent {

  @Input('id')
  id: string;

  @Input('uri')
  uri: string;

  @Output()
  deleteSucceeds: EventEmitter<string> = new EventEmitter();

  constructor(
    private deleteService: DeleteService,
    public dialog: MatDialog,
  ) { }


  openDialog(): void {
    const dialogRef = this.dialog.open(DialogComponent, {
      data: { id: this.id }
    });

    dialogRef.afterClosed().subscribe(result => {
      if (result !== undefined) {
        this.deleteService.delete(this.uri, this.id).subscribe((next) =>
          this.deleteSucceeds.emit(this.id)
        )}
    });
  }

}
