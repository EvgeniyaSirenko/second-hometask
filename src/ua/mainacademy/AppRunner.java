package ua.mainacademy;

import ua.mainacademy.service.NumericService;

import java.util.logging.Logger;

public class AppRunner {

    private static final Logger LOG = Logger.getLogger(AppRunner.class.getName());

    public static void main(String[] args) {

        int result1 = NumericService.getSumByTypes(123456);
        int result2 = NumericService.getSumByMath(123456);

        LOG.info(String.format("The first result is %d", result1));
        LOG.info(String.format("The second result is %d", result2));
    }
}
