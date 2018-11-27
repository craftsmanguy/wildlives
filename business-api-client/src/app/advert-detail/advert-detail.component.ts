import { Component, OnInit, Input } from '@angular/core';
import { Advert } from './index';

import { ActivatedRoute, ParamMap } from '@angular/router';
import { Router } from '@angular/router';

import { AdvertService } from '../services/advert.service';

@Component({
  selector: 'app-advert-detail',
  templateUrl: './advert-detail.component.html',
  styleUrls: ['./advert-detail.component.css']
})
export class AdvertDetailComponent implements OnInit {
  @Input()
  advert: Advert;
  advertId: string;
  fromUrl = true;

  constructor(
    private router: Router,
    private route: ActivatedRoute,
    private advertService: AdvertService
  ) { }

  ngOnInit() {
    this.getAdvertById();
  };

  getAdvertById() {
    this.checkIdInUrlParam();
    if (this.advertId !== undefined) {
      this.advertService.getAdvertById(this.advertId).subscribe(advert => { this.advert = advert });
      this.fromUrl = false;
    }
  };

  checkIdInUrlParam() {
    this.route.params.subscribe(params => {
      this.advertId = params['id'];
    });
  };

  redirectForAdvertDetail(id) {
    const urlAdvertById: string = this.router.url + '/';
    this.router.navigate([urlAdvertById, id]);
  };
}

