package com.example.TravelCard.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class TravellerValidatorUtils {
	
	private static final String  ATOM           = "[^\\x00-\\x1F^\\(^\\)^\\<^\\>^\\@^\\,^\\;^\\:^\\\\^\\\"^\\.^\\[^\\]^\\s]";
    private static final String  DOMAIN         = "(" + ATOM + "+(\\." + ATOM + "+)+";
    private static final Pattern EMAIL_PATTERN  = java.util.regex.Pattern.compile("^" + ATOM + "+(\\." + ATOM + "+)*@" + DOMAIN + ")$", java.util.regex.Pattern.CASE_INSENSITIVE);
    private static final Pattern MOBILE_PATTERN = Pattern.compile("^\\+?(91|0)?-?([1-9][0-9]{9})$");
    private static final Pattern INDIAN_MOBILE_PATTERN = Pattern.compile("^\\+?(91|0)?-?([6-9][0-9]{9})$");
    private static final Pattern PHONE_NUMBER_PATTERN = Pattern.compile("^\\+?(0|00)?-?([1-9][0-9]{6,14})$");
    
    public static boolean isEmailValid(String value) {
        if (value == null || value.length() == 0) {
            return false;
        }
        if(value.contains("\\'") ||value.contains("\\`")){
            return false;
        }
//        Matcher m = EMAIL_PATTERN.matcher(value);
//        String domain = StringUtils.getEmailDomain(value);
//        boolean isValid = m.matches() && !CacheManager.getInstance().getCache(EmailDomainsCache.class).isDomainBlocked(domain);
//        Pattern addressPattern = CacheManager.getInstance().getCache(EmailDomainsCache.class).getAddressPatternForDomain(domain);
//        // check for domain specific pattern if email address is valid
//        if (isValid && (addressPattern != null)) {
//            isValid = addressPattern.matcher(StringUtils.getLocalPartFromEmail(value)).matches();
//        }
//        return isValid;
        
        return true;
    }

}
