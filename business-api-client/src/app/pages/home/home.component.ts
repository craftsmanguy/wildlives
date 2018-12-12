import { Component, OnInit } from '@angular/core';

import { OptionSearch } from '../../commons/model';


import { ActivatedRoute, ParamMap } from '@angular/router';
import { Router } from '@angular/router';

import { CampaignService } from '../../services/campaign.service';

import { Campaign } from '../../campaign/model';

import { UserAction } from '../../profil/model';



@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  campaigns: Campaign[];
  parametersSearch: OptionSearch;

  constructor(
    private campaignService: CampaignService,
    private router: Router,
    private route: ActivatedRoute,
  ) { }

  ngOnInit() {
    this.getCampaigns();
  };

  onParametersSearch(search: OptionSearch) {
    this.parametersSearch = search;
  };

  onUserAction(action: UserAction) {
    this.router.navigate(['/campaigns', action.id], { queryParams: this.parametersSearch });
  }

  getCampaigns() {
    this.campaignService.search().subscribe(data => this.campaigns = data);
  };

}
