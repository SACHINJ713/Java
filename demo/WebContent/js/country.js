function country() {
	var c = {
		AFG : "Afghanistan",
		ALB : "Albania",
		DZA : "Algeria",
		AND : "Andorra",
		AGO : "Angola",
		ATG : "Antigua and Barbuda",
		ARG : "Argentina",
		ARM : "Armenia",
		AUS : "Australia",
		AUT : "Austria",
		AZE : "Azerbaijan",
		BHS : "Bahamas",
		BHR : "Bahrain",
		BGD : "Bangladesh",
		BRB : "Barbados",
		BLR : "Belarus",
		BEL : "Belgium",
		BLZ : "Belize",
		BEN : "Benin",
		BTN : "Bhutan",
		BOL : "Bolivia",
		BIH : "Bosnia and Herzegovina",
		BWA : "Botswana",
		BRA : "Brazil",
		BRN : "Brunei Darussalam",
		BGR : "Bulgaria",
		BFA : "Burkina Faso",
		BDI : "Burundi",
		CPV : "Cabo Verde",
		KHM : "Cambodia",
		CMR : "Cameroon",
		CAN : "Canada",
		CAF : "Central African Republic",
		TCD : "Chad",
		CHL : "Chile",
		CHN : "China",
		COL : "Colombia",
		COM : "Comoros",
		COG : "Congo",
		COK : "Cook Islands",
		CRI : "Costa Rica",
		HRV : "Croatia",
		CUB : "Cuba",
		CYP : "Cyprus",
		CZE : "Czechia",
		CIV : "Côte dIvoire",
		PRK : "Democratic People's Republic of Korea",
		COD : "Democratic Republic of the Congo",
		DNK : "Denmark",
		DJI : "Djibouti",
		DMA : "Dominica",
		DOM : "Dominican Republic",
		ECU : "Ecuador",
		EGY : "Egypt",
		SLV : "El Salvador",
		GNQ : "Equatorial Guinea",
		ERI : "Eritrea",
		EST : "Estonia",
		SWZ : "Eswatini",
		ETH : "Ethiopia",
		FRO : "Faroe Islands",
		FJI : "Fiji",
		FIN : "Finland",
		FRA : "France",
		GAB : "Gabon",
		GMB : "Gambia",
		GEO : "Georgia",
		DEU : "Germany",
		GHA : "Ghana",
		GRC : "Greece",
		GRD : "Grenada",
		GTM : "Guatemala",
		GIN : "Guinea",
		GNB : "Guinea-Bissau",
		GUY : "Guyana",
		HTI : "Haiti",
		HND : "Honduras",
		HUN : "Hungary",
		ISL : "Iceland",
		IND : "India",
		IDN : "Indonesia",
		IRN : "Iran",
		IRQ : "Iraq",
		IRL : "Ireland",
		ISR : "Israel",
		ITA : "Italy",
		JAM : "Jamaica",
		JPN : "Japan",
		JOR : "Jordan",
		KAZ : "Kazakhstan",
		KEN : "Kenya",
		KIR : "Kiribati",
		KWT : "Kuwait",
		KGZ : "Kyrgyzstan",
		LAO : "Lao Peoples Democratic Republic",
		LVA : "Latvia",
		LBN : "Lebanon",
		LSO : "Lesotho",
		LBR : "Liberia",
		LBY : "Libya",
		LTU : "Lithuania",
		LUX : "Luxembourg",
		MDG : "Madagascar",
		MWI : "Malawi",
		MYS : "Malaysia",
		MDV : "Maldives",
		MLI : "Mali",
		MLT : "Malta",
		MHL : "Marshall Islands",
		MRT : "Mauritania",
		MUS : "Mauritius",
		MEX : "Mexico",
		FSM : "Micronesia",
		MCO : "Monaco",
		MNG : "Mongolia",
		MNE : "Montenegro",
		MAR : "Morocco",
		MOZ : "Mozambique",
		MMR : "Myanmar",
		NAM : "Namibia",
		NRU : "Nauru",
		NPL : "Nepal",
		NLD : "Netherlands",
		NZL : "New Zealand",
		NIC : "Nicaragua",
		NER : "Niger",
		NGA : "Nigeria",
		NIU : "Niue",
		NOR : "Norway",
		OMN : "Oman",
		PAK : "Pakistan",
		PLW : "Palau",
		PAN : "Panama",
		PNG : "Papua New Guinea",
		PRY : "Paraguay",
		PER : "Peru",
		PHL : "Philippines",
		POL : "Poland",
		PRT : "Portugal",
		QAT : "Qatar",
		KOR : "Republic of Korea",
		MDA : "Republic of Moldova",
		ROU : "Romania",
		RUS : "Russian Federation",
		RWA : "Rwanda",
		KNA : "Saint Kitts and Nevis",
		LCA : "Saint Lucia",
		VCT : "Saint Vincent and the Grenadines",
		WSM : "Samoa",
		SMR : "San Marino",
		STP : "Sao Tome and Principe",
		SAU : "Saudi Arabia",
		SEN : "Senegal",
		SRB : "Serbia",
		SYC : "Seychelles",
		SLE : "Sierra Leone",
		SGP : "Singapore",
		SVK : "Slovakia",
		SVN : "Slovenia",
		SLB : "Solomon Islands",
		SOM : "Somalia",
		ZAF : "South Africa",
		SSD : "South Sudan",
		ESP : "Spain",
		LKA : "Sri Lanka",
		SDN : "Sudan",
		SUR : "Suriname",
		SWE : "Sweden",
		CHE : "Switzerland",
		SYR : "Syrian Arab Republic",
		TJK : "Tajikistan",
		THA : "Thailand",
		MKD : "Republic of Macedonia",
		TLS : "Timor-Leste",
		TGO : "Togo",
		TKL : "Tokelau",
		TON : "Tonga",
		TTO : "Trinidad and Tobago",
		TUN : "Tunisia",
		TUR : "Turkey",
		TKM : "Turkmenistan",
		TUV : "Tuvalu",
		UGA : "Uganda",
		UKR : "Ukraine",
		ARE : "United Arab Emirates",
		GBR : "United Kingdom",
		TZA : "United Republic of Tanzania",
		USA : "United States of America",
		URY : "Uruguay",
		UZB : "Uzbekistan",
		VUT : "Vanuatu",
		VEN : "Venezuela",
		VNM : "Viet Nam",
		YEM : "Yemen",
		ZMB : "Zambia",
		ZWE : "Zimbabwe"
	}

	var o = "<option value=''>select</option> ";
	for (i in c) {
		o += "<option value='" + i + "'>" + c[i] + "</option> ";

	}
	document.getElementById('country').innerHTML = o;
}