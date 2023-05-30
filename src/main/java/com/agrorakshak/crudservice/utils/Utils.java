package com.agrorakshak.crudservice.utils;

import java.util.UUID;

public class Utils {
	public static String generateGUID() {
		UUID idOne = UUID.randomUUID();
		String uuid = idOne.toString();
		uuid = uuid.replaceFirst(".{4}", "agro");
		return uuid;
	}
}
