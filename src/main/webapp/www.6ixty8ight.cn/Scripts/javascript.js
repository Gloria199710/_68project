function geoplugin_request() { return '157.122.68.239';} 
function geoplugin_status() { return '200';} 
function geoplugin_credit() { return 'Some of the returned data includes GeoLite data created by MaxMind, available from <a href=\'http://www.maxmind.com\'>http://www.maxmind.com</a>.';} 
function geoplugin_delay() { return '2ms';} 
function geoplugin_city() { return 'Guangzhou';} 
function geoplugin_region() { return 'Guangdong';} 
function geoplugin_regionCode() { return 'GD';} 
function geoplugin_regionName() { return 'Guangdong';} 
function geoplugin_areaCode() { return '';} 
function geoplugin_dmaCode() { return '';} 
function geoplugin_countryCode() { return 'CN';} 
function geoplugin_countryName() { return 'China';} 
function geoplugin_inEU() { return 0;} 
function geoplugin_euVATrate() { return ;} 
function geoplugin_continentCode() { return 'AS';} 
function geoplugin_latitude() { return '23.1167';} 
function geoplugin_longitude() { return '113.25';} 
function geoplugin_locationAccuracyRadius() { return '1';} 
function geoplugin_timezone() { return 'Asia/Shanghai';} 
function geoplugin_currencyCode() { return 'CNY';} 
function geoplugin_currencySymbol() { return '&#20803;';} 
function geoplugin_currencySymbol_UTF8() { return '元';} 
function geoplugin_currencyConverter(amt, symbol) { 
	if (!amt) { return false; } 
	var converted = amt * 6.8438; 
	if (converted <0) { return false; } 
	if (symbol === false) { return Math.round(converted * 100)/100; } 
	else { return '&#20803;'+(Math.round(converted * 100)/100);} 
	return false; 
} 
