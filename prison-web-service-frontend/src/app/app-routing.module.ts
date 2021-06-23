import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { CellComponent } from './cell/cell.component';

const routes: Routes = [
  { path: '', component: AppComponent},
  { path: 'cells', component: CellComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
