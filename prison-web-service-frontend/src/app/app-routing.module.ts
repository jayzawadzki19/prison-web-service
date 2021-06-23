import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { CellComponent } from './components/cell/cell.component';

const routes: Routes = [
  { path: '', component: AppComponent},
  { path: 'cells', children:
    [
      {path: 'all', component: CellComponent}
    ] }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
