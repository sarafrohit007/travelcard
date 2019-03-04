package com.example.TravelCard.cache;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import com.example.TravelCard.entity.EmailDomain;

@Cache(name = "emailDomainCache")
public class EmailDomainCache {

	private List<EmailDomain> emailDomains = new ArrayList<EmailDomain>();
	private Map<String, EmailDomain> domainToEmailDomain = new HashMap<String, EmailDomain>();
	private Map<String, Pattern> domainToEmailPattern = new HashMap<String, Pattern>();

	public void addEmailDomain(EmailDomain emailDomain) {
		emailDomains.add(emailDomain);
		domainToEmailDomain.put(emailDomain.getDomain(), emailDomain);
		if (emailDomain.getPattern() != null)
			domainToEmailPattern.put(emailDomain.getDomain(), Pattern.compile(emailDomain.getPattern()));
	}

	public boolean isDomainBlocked(String emailDomain) {
		EmailDomain domain = domainToEmailDomain.get(emailDomain);
		return domain != null ? domain.isBlocked() : false;
	}

	public Pattern getAddressPatternForDomain(String emailDomain) {
		return domainToEmailPattern.get(emailDomain);
	}
}
