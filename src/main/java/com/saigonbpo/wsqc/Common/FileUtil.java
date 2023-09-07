package com.saigonbpo.wsqc.Common;

import org.apache.commons.io.FilenameUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.stream.Collectors;

public class FileUtil {

    public static  boolean isZip(String fileName) {
        return FilenameUtils.getExtension(fileName).toLowerCase().equals("zip");
    }

    public static  boolean isXLS(String fileName) {
        if (FilenameUtils.getExtension(fileName).toLowerCase().equals("xls") 
                || FilenameUtils.getExtension(fileName).toLowerCase().equals("xlsx")) {
            return true;
        }
        return false;
    }

    public static boolean matchNamingPattern(String fileName, String pattern) {
        return fileName.matches(pattern);
    }

    public static void saveFile(MultipartFile file, String destFile) throws IOException {

        FileOutputStream outStream = null;

        try {
            File zipFile = new File(destFile);

            if(zipFile.exists())
                zipFile.delete();
            else {
                File filePath = new File(zipFile.getParent());
                if (!filePath.exists()) {
                    filePath.mkdirs();
                }
            }
            outStream = new FileOutputStream(destFile);
            outStream.write(file.getBytes());

        } catch (IOException e) {
            throw e;
        } finally {
            if (outStream != null) {
                outStream.close();
            }
        }
    }

    public static String getPath(String... paths) {

        return Arrays.stream(paths).filter(FileUtil::isNotNullEmpty)
                .map(path -> path.endsWith(File.pathSeparator) ? path.substring(0, path.length() - 1) : path)
                .collect(Collectors.joining(String.valueOf(File.separatorChar)));
    }

    public static boolean isNotNullEmpty(String str) {
        return str != null && !str.isEmpty();
    }

    public static String getCellValueAsString(Cell cell) {
        String strCellValue = "";
        if (cell != null) {
            switch (cell.getCellType()) {
                case Cell.CELL_TYPE_STRING:
                    strCellValue = cell.toString();
                    break;
                case Cell.CELL_TYPE_NUMERIC:
                    if (DateUtil.isCellDateFormatted(cell)) {
                        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                        strCellValue = dateFormat.format(cell.getDateCellValue());
                    } else {
                        Double value = cell.getNumericCellValue();
                        Long longValue = value.longValue();
                        strCellValue = new String(longValue.toString());
                    }
                    break;
                case Cell.CELL_TYPE_BOOLEAN:
                    strCellValue = new String(new Boolean(cell.getBooleanCellValue()).toString());
                    break;
                case Cell.CELL_TYPE_BLANK:
                    strCellValue = "";
                    break;
            }
        }
        return strCellValue;
    }
}
