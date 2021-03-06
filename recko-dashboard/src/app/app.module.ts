import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { NgxPaginationModule } from 'ngx-pagination';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { ConsumerComponent } from './consumer-list/consumer/consumer.component';
import { ConsumerFormComponent } from './consumer-list/consumer-form/consumer-form.component';
import { LoginComponent } from './authentication/login/login.component';
import { ChangePasswordComponent } from './authentication/change-password/change-password.component';
import { FallbackComponent } from './helpers/fallback/fallback.component';
import { ConsumerListComponent } from './consumer-list/consumer-list.component';
import { LoadingComponent } from './helpers/loading/loading.component';
import { TransactionListComponent } from './transaction-list/transaction-list.component';
import { TransactionComponent } from './transaction-list/transaction/transaction.component';
import { CompanyRegisterComponent } from './company/company-register/company-register.component';
import { CompanyHandlerRegisterComponent } from './company/company-handler-register/company-handler-register.component';
import { CompanyCredentialRegisterComponent } from './company/company-credential-register/company-credential-register.component';
import { ForgotPasswordComponent } from './authentication/forgot-password/forgot-password.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    ConsumerComponent,
    ConsumerFormComponent,
    LoginComponent,
    ChangePasswordComponent,
    FallbackComponent,
    ConsumerListComponent,
    LoadingComponent,
    TransactionListComponent,
    TransactionComponent,
    CompanyRegisterComponent,
    CompanyHandlerRegisterComponent,
    CompanyCredentialRegisterComponent,
    ForgotPasswordComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    NgxPaginationModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
