package X;

import android.util.Log;
import android.util.Pair;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.0nr  reason: invalid class name and case insensitive filesystem */
public class C15320nr {
    public static SimpleDateFormat A0G;
    public static final C15300np A0H = new C15300np("JPEGInterchangeFormatLength", 514, 4);
    public static final C15300np A0I = new C15300np("JPEGInterchangeFormat", 513, 4);
    public static final C15300np A0J = new C15300np("StripOffsets", 273, 3);
    public static final Charset A0K;
    public static final HashMap A0L = new HashMap();
    public static final HashSet A0M = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
    public static final Pattern A0N = Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");
    public static final byte[] A0O = {65, 83, 67, 73, 73, 0, 0, 0};
    public static final byte[] A0P;
    public static final byte[] A0Q = {-1, -40, -1};
    public static final byte[] A0R = {79, 76, 89, 77, 80, 0};
    public static final byte[] A0S = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    public static final int[] A0T = {8};
    public static final int[] A0U = {8, 8, 8};
    public static final int[] A0V = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    public static final C15300np[] A0W = {new C15300np("SubIFDPointer", 330, 4), new C15300np("ExifIFDPointer", 34665, 4), new C15300np("GPSInfoIFDPointer", 34853, 4), new C15300np("InteroperabilityIFDPointer", 40965, 4), new C15300np("CameraSettingsIFDPointer", 8224, 1), new C15300np("ImageProcessingIFDPointer", 8256, 1)};
    public static final C15300np[] A0X;
    public static final C15300np[] A0Y;
    public static final C15300np[] A0Z;
    public static final C15300np[] A0a;
    public static final C15300np[] A0b;
    public static final C15300np[] A0c;
    public static final C15300np[] A0d;
    public static final C15300np[] A0e;
    public static final C15300np[] A0f;
    public static final String[] A0g = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE"};
    public static final HashMap[] A0h = new HashMap[10];
    public static final HashMap[] A0i = new HashMap[10];
    public static final C15300np[][] A0j;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public ByteOrder A09 = ByteOrder.BIG_ENDIAN;
    public Set A0A;
    public boolean A0B;
    public boolean A0C;
    public byte[] A0D;
    public final String A0E;
    public final HashMap[] A0F;

    static {
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        C15300np[] r6 = {new C15300np("NewSubfileType", 254, 4), new C15300np("SubfileType", 255, 4), new C15300np("ImageWidth", 256), new C15300np("ImageLength", 257), new C15300np("BitsPerSample", 258, 3), new C15300np("Compression", 259, 3), new C15300np("PhotometricInterpretation", 262, 3), new C15300np("ImageDescription", 270, 2), new C15300np("Make", 271, 2), new C15300np("Model", 272, 2), new C15300np("StripOffsets", 273), new C15300np("Orientation", 274, 3), new C15300np("SamplesPerPixel", 277, 3), new C15300np("RowsPerStrip", 278), new C15300np("StripByteCounts", 279), new C15300np("XResolution", 282, 5), new C15300np("YResolution", 283, 5), new C15300np("PlanarConfiguration", 284, 3), new C15300np("ResolutionUnit", 296, 3), new C15300np("TransferFunction", 301, 3), new C15300np("Software", 305, 2), new C15300np("DateTime", 306, 2), new C15300np("Artist", 315, 2), new C15300np("WhitePoint", 318, 5), new C15300np("PrimaryChromaticities", 319, 5), new C15300np("SubIFDPointer", 330, 4), new C15300np("JPEGInterchangeFormat", 513, 4), new C15300np("JPEGInterchangeFormatLength", 514, 4), new C15300np("YCbCrCoefficients", 529, 5), new C15300np("YCbCrSubSampling", 530, 3), new C15300np("YCbCrPositioning", 531, 3), new C15300np("ReferenceBlackWhite", 532, 5), new C15300np("Copyright", 33432, 2), new C15300np("ExifIFDPointer", 34665, 4), new C15300np("GPSInfoIFDPointer", 34853, 4), new C15300np("SensorTopBorder", 4, 4), new C15300np("SensorLeftBorder", 5, 4), new C15300np("SensorBottomBorder", 6, 4), new C15300np("SensorRightBorder", 7, 4), new C15300np("ISO", 23, 3), new C15300np("JpgFromRaw", 46, 7)};
        A0b = r6;
        C15300np[] r5 = {new C15300np("ExposureTime", 33434, 5), new C15300np("FNumber", 33437, 5), new C15300np("ExposureProgram", 34850, 3), new C15300np("SpectralSensitivity", 34852, 2), new C15300np("PhotographicSensitivity", 34855, 3), new C15300np("OECF", 34856, 7), new C15300np("ExifVersion", 36864, 2), new C15300np("DateTimeOriginal", 36867, 2), new C15300np("DateTimeDigitized", 36868, 2), new C15300np("ComponentsConfiguration", 37121, 7), new C15300np("CompressedBitsPerPixel", 37122, 5), new C15300np("ShutterSpeedValue", 37377, 10), new C15300np("ApertureValue", 37378, 5), new C15300np("BrightnessValue", 37379, 10), new C15300np("ExposureBiasValue", 37380, 10), new C15300np("MaxApertureValue", 37381, 5), new C15300np("SubjectDistance", 37382, 5), new C15300np("MeteringMode", 37383, 3), new C15300np("LightSource", 37384, 3), new C15300np("Flash", 37385, 3), new C15300np("FocalLength", 37386, 5), new C15300np("SubjectArea", 37396, 3), new C15300np("MakerNote", 37500, 7), new C15300np("UserComment", 37510, 7), new C15300np("SubSecTime", 37520, 2), new C15300np("SubSecTimeOriginal", 37521, 2), new C15300np("SubSecTimeDigitized", 37522, 2), new C15300np("FlashpixVersion", 40960, 7), new C15300np("ColorSpace", 40961, 3), new C15300np("PixelXDimension", 40962), new C15300np("PixelYDimension", 40963), new C15300np("RelatedSoundFile", 40964, 2), new C15300np("InteroperabilityIFDPointer", 40965, 4), new C15300np("FlashEnergy", 41483, 5), new C15300np("SpatialFrequencyResponse", 41484, 7), new C15300np("FocalPlaneXResolution", 41486, 5), new C15300np("FocalPlaneYResolution", 41487, 5), new C15300np("FocalPlaneResolutionUnit", 41488, 3), new C15300np("SubjectLocation", 41492, 3), new C15300np("ExposureIndex", 41493, 5), new C15300np("SensingMethod", 41495, 3), new C15300np("FileSource", 41728, 7), new C15300np("SceneType", 41729, 7), new C15300np("CFAPattern", 41730, 7), new C15300np("CustomRendered", 41985, 3), new C15300np("ExposureMode", 41986, 3), new C15300np("WhiteBalance", 41987, 3), new C15300np("DigitalZoomRatio", 41988, 5), new C15300np("FocalLengthIn35mmFilm", 41989, 3), new C15300np("SceneCaptureType", 41990, 3), new C15300np("GainControl", 41991, 3), new C15300np("Contrast", 41992, 3), new C15300np("Saturation", 41993, 3), new C15300np("Sharpness", 41994, 3), new C15300np("DeviceSettingDescription", 41995, 7), new C15300np("SubjectDistanceRange", 41996, 3), new C15300np("ImageUniqueID", 42016, 2), new C15300np("DNGVersion", 50706, 1), new C15300np("DefaultCropSize", 50720)};
        A0X = r5;
        C15300np[] r4 = {new C15300np("GPSVersionID", 0, 1), new C15300np("GPSLatitudeRef", 1, 2), new C15300np("GPSLatitude", 2, 5), new C15300np("GPSLongitudeRef", 3, 2), new C15300np("GPSLongitude", 4, 5), new C15300np("GPSAltitudeRef", 5, 1), new C15300np("GPSAltitude", 6, 5), new C15300np("GPSTimeStamp", 7, 5), new C15300np("GPSSatellites", 8, 2), new C15300np("GPSStatus", 9, 2), new C15300np("GPSMeasureMode", 10, 2), new C15300np("GPSDOP", 11, 5), new C15300np("GPSSpeedRef", 12, 2), new C15300np("GPSSpeed", 13, 5), new C15300np("GPSTrackRef", 14, 2), new C15300np("GPSTrack", 15, 5), new C15300np("GPSImgDirectionRef", 16, 2), new C15300np("GPSImgDirection", 17, 5), new C15300np("GPSMapDatum", 18, 2), new C15300np("GPSDestLatitudeRef", 19, 2), new C15300np("GPSDestLatitude", 20, 5), new C15300np("GPSDestLongitudeRef", 21, 2), new C15300np("GPSDestLongitude", 22, 5), new C15300np("GPSDestBearingRef", 23, 2), new C15300np("GPSDestBearing", 24, 5), new C15300np("GPSDestDistanceRef", 25, 2), new C15300np("GPSDestDistance", 26, 5), new C15300np("GPSProcessingMethod", 27, 7), new C15300np("GPSAreaInformation", 28, 7), new C15300np("GPSDateStamp", 29, 2), new C15300np("GPSDifferential", 30, 3)};
        A0Y = r4;
        C15300np[] r0 = {new C15300np("InteroperabilityIndex", 1, 2)};
        A0Z = r0;
        C15300np[] r14 = {new C15300np("NewSubfileType", 254, 4), new C15300np("SubfileType", 255, 4), new C15300np("ThumbnailImageWidth", 256), new C15300np("ThumbnailImageLength", 257), new C15300np("BitsPerSample", 258, 3), new C15300np("Compression", 259, 3), new C15300np("PhotometricInterpretation", 262, 3), new C15300np("ImageDescription", 270, 2), new C15300np("Make", 271, 2), new C15300np("Model", 272, 2), new C15300np("StripOffsets", 273), new C15300np("Orientation", 274, 3), new C15300np("SamplesPerPixel", 277, 3), new C15300np("RowsPerStrip", 278), new C15300np("StripByteCounts", 279), new C15300np("XResolution", 282, 5), new C15300np("YResolution", 283, 5), new C15300np("PlanarConfiguration", 284, 3), new C15300np("ResolutionUnit", 296, 3), new C15300np("TransferFunction", 301, 3), new C15300np("Software", 305, 2), new C15300np("DateTime", 306, 2), new C15300np("Artist", 315, 2), new C15300np("WhitePoint", 318, 5), new C15300np("PrimaryChromaticities", 319, 5), new C15300np("SubIFDPointer", 330, 4), new C15300np("JPEGInterchangeFormat", 513, 4), new C15300np("JPEGInterchangeFormatLength", 514, 4), new C15300np("YCbCrCoefficients", 529, 5), new C15300np("YCbCrSubSampling", 530, 3), new C15300np("YCbCrPositioning", 531, 3), new C15300np("ReferenceBlackWhite", 532, 5), new C15300np("Copyright", 33432, 2), new C15300np("ExifIFDPointer", 34665, 4), new C15300np("GPSInfoIFDPointer", 34853, 4), new C15300np("DNGVersion", 50706, 1), new C15300np("DefaultCropSize", 50720)};
        A0a = r14;
        C15300np[] r3 = {new C15300np("ThumbnailImage", 256, 7), new C15300np("CameraSettingsIFDPointer", 8224, 4), new C15300np("ImageProcessingIFDPointer", 8256, 4)};
        A0e = r3;
        C15300np[] r2 = {new C15300np("PreviewImageStart", 257, 4), new C15300np("PreviewImageLength", 258, 4)};
        A0c = r2;
        C15300np[] r02 = {new C15300np("AspectFrame", 4371, 3)};
        A0d = r02;
        C15300np[] r15 = {new C15300np("ColorSpace", 55, 3)};
        A0f = r15;
        A0j = new C15300np[][]{r6, r5, r4, r0, r14, r6, r3, r2, r02, r15};
        Charset forName = Charset.forName("US-ASCII");
        A0K = forName;
        A0P = "Exif\u0000\u0000".getBytes(forName);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
        A0G = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            C15300np[][] r22 = A0j;
            if (i < r22.length) {
                A0h[i] = new HashMap();
                A0i[i] = new HashMap();
                C15300np[] r52 = r22[i];
                for (C15300np r23 : r52) {
                    A0h[i].put(Integer.valueOf(r23.A00), r23);
                    A0i[i].put(r23.A03, r23);
                }
                i++;
            } else {
                HashMap hashMap = A0L;
                hashMap.put(Integer.valueOf(A0W[0].A00), 5);
                hashMap.put(Integer.valueOf(A0W[1].A00), 1);
                hashMap.put(Integer.valueOf(A0W[2].A00), 2);
                hashMap.put(Integer.valueOf(A0W[3].A00), 3);
                hashMap.put(Integer.valueOf(A0W[4].A00), 7);
                hashMap.put(Integer.valueOf(A0W[5].A00), 8);
                Pattern.compile(".*[1-9].*");
                return;
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:140|141) */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02ab, code lost:
        if (java.util.Arrays.equals(r2, r1) != false) goto L_0x02ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:?, code lost:
        r17.A0C = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0370, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0371, code lost:
        A06();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0374, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:140:0x0367 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C15320nr(java.lang.String r18) {
        /*
        // Method dump skipped, instructions count: 930
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15320nr.<init>(java.lang.String):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:66|67|68) */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        java.lang.Double.parseDouble(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0147, code lost:
        return new android.util.Pair(12, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x014d, code lost:
        return new android.util.Pair(2, -1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:66:0x0139 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair A00(java.lang.String r13) {
        /*
        // Method dump skipped, instructions count: 334
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15320nr.A00(java.lang.String):android.util.Pair");
    }

    public static final ByteOrder A01(C15270nm r2) {
        short readShort = r2.readShort();
        if (readShort == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        StringBuilder A0S2 = AnonymousClass008.A0S("Invalid byte order: ");
        A0S2.append(Integer.toHexString(readShort));
        throw new IOException(A0S2.toString());
    }

    public static void A02(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public final C15290no A03(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < A0j.length; i++) {
            C15290no r0 = (C15290no) this.A0F[i].get(str);
            if (r0 != null) {
                return r0;
            }
        }
        return null;
    }

    public String A04(String str) {
        double d;
        C15290no A032 = A03(str);
        if (A032 != null) {
            if (!A0M.contains(str)) {
                return A032.A08(this.A09);
            }
            if (str.equals("GPSTimeStamp")) {
                int i = A032.A00;
                if (i == 5 || i == 10) {
                    C15310nq[] r6 = (C15310nq[]) A032.A07(this.A09);
                    if (r6 == null || r6.length != 3) {
                        StringBuilder A0S2 = AnonymousClass008.A0S("Invalid GPS Timestamp array. array=");
                        A0S2.append(Arrays.toString(r6));
                        Log.w("ExifInterface", A0S2.toString());
                        return null;
                    }
                    C15310nq r2 = r6[0];
                    C15310nq r22 = r6[1];
                    C15310nq r23 = r6[2];
                    return String.format("%02d:%02d:%02d", Integer.valueOf((int) (((float) r2.A01) / ((float) r2.A00))), Integer.valueOf((int) (((float) r22.A01) / ((float) r22.A00))), Integer.valueOf((int) (((float) r23.A01) / ((float) r23.A00))));
                }
                StringBuilder A0S3 = AnonymousClass008.A0S("GPS Timestamp format is not rational. format=");
                A0S3.append(i);
                Log.w("ExifInterface", A0S3.toString());
                return null;
            }
            try {
                Object A072 = A032.A07(this.A09);
                if (A072 != null) {
                    if (A072 instanceof String) {
                        d = Double.parseDouble((String) A072);
                    } else if (A072 instanceof long[]) {
                        long[] jArr = (long[]) A072;
                        if (jArr.length == 1) {
                            d = (double) jArr[0];
                        } else {
                            throw new NumberFormatException("There are more than one component");
                        }
                    } else if (A072 instanceof int[]) {
                        int[] iArr = (int[]) A072;
                        if (iArr.length == 1) {
                            d = (double) iArr[0];
                        } else {
                            throw new NumberFormatException("There are more than one component");
                        }
                    } else if (A072 instanceof double[]) {
                        double[] dArr = (double[]) A072;
                        if (dArr.length == 1) {
                            d = dArr[0];
                        } else {
                            throw new NumberFormatException("There are more than one component");
                        }
                    } else if (A072 instanceof C15310nq[]) {
                        C15310nq[] r4 = (C15310nq[]) A072;
                        if (r4.length == 1) {
                            C15310nq r24 = r4[0];
                            d = ((double) r24.A01) / ((double) r24.A00);
                        } else {
                            throw new NumberFormatException("There are more than one component");
                        }
                    } else {
                        throw new NumberFormatException("Couldn't find a double value");
                    }
                    return Double.toString(d);
                }
                throw new NumberFormatException("NULL can't be converted to a double value");
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public void A05() {
        FileOutputStream fileOutputStream;
        Throwable th;
        if (!this.A0C || this.A01 != 4) {
            throw new IOException("ExifInterface only supports saving attributes on JPEG formats.");
        }
        String str = this.A0E;
        if (str != null) {
            int i = this.A06;
            FileInputStream fileInputStream = null;
            this.A0D = (i == 6 || i == 7) ? A0H() : null;
            File file = new File(AnonymousClass008.A0O(new StringBuilder(), str, ".tmp"));
            if (new File(str).renameTo(file)) {
                try {
                    FileInputStream fileInputStream2 = new FileInputStream(file);
                    try {
                        fileOutputStream = new FileOutputStream(str);
                        try {
                            DataInputStream dataInputStream = new DataInputStream(fileInputStream2);
                            C15280nn r4 = new C15280nn(fileOutputStream, ByteOrder.BIG_ENDIAN);
                            if (dataInputStream.readByte() == -1) {
                                OutputStream outputStream = r4.A01;
                                outputStream.write(-1);
                                if (dataInputStream.readByte() == -40) {
                                    outputStream.write(-40);
                                    outputStream.write(-1);
                                    outputStream.write(-31);
                                    int length = A0j.length;
                                    int[] iArr = new int[length];
                                    int[] iArr2 = new int[length];
                                    C15300np[] r7 = A0W;
                                    for (C15300np r0 : r7) {
                                        A0F(r0.A03);
                                    }
                                    A0F("JPEGInterchangeFormat");
                                    A0F("JPEGInterchangeFormatLength");
                                    for (int i2 = 0; i2 < length; i2++) {
                                        HashMap[] hashMapArr = this.A0F;
                                        for (Object obj : hashMapArr[i2].entrySet().toArray()) {
                                            Map.Entry entry = (Map.Entry) obj;
                                            if (entry.getValue() == null) {
                                                hashMapArr[i2].remove(entry.getKey());
                                            }
                                        }
                                    }
                                    HashMap[] hashMapArr2 = this.A0F;
                                    if (!hashMapArr2[1].isEmpty()) {
                                        hashMapArr2[0].put(r7[1].A03, C15290no.A01(0, this.A09));
                                    }
                                    if (!hashMapArr2[2].isEmpty()) {
                                        hashMapArr2[0].put(r7[2].A03, C15290no.A01(0, this.A09));
                                    }
                                    if (!hashMapArr2[3].isEmpty()) {
                                        hashMapArr2[1].put(r7[3].A03, C15290no.A01(0, this.A09));
                                    }
                                    if (this.A0B) {
                                        hashMapArr2[4].put("JPEGInterchangeFormat", C15290no.A01(0, this.A09));
                                        hashMapArr2[4].put("JPEGInterchangeFormatLength", C15290no.A01((long) this.A07, this.A09));
                                    }
                                    for (int i3 = 0; i3 < length; i3++) {
                                        int i4 = 0;
                                        for (Map.Entry entry2 : hashMapArr2[i3].entrySet()) {
                                            C15290no r13 = (C15290no) entry2.getValue();
                                            if (r13 != null) {
                                                int i5 = A0V[r13.A00] * r13.A01;
                                                if (i5 > 4) {
                                                    i4 += i5;
                                                }
                                            } else {
                                                throw null;
                                            }
                                        }
                                        iArr2[i3] = iArr2[i3] + i4;
                                    }
                                    int i6 = 8;
                                    for (int i7 = 0; i7 < length; i7++) {
                                        if (!hashMapArr2[i7].isEmpty()) {
                                            iArr[i7] = i6;
                                            i6 += (hashMapArr2[i7].size() * 12) + 2 + 4 + iArr2[i7];
                                        }
                                    }
                                    if (this.A0B) {
                                        hashMapArr2[4].put("JPEGInterchangeFormat", C15290no.A01((long) i6, this.A09));
                                        this.A08 = i6 + 6;
                                        i6 += this.A07;
                                    }
                                    int i8 = i6 + 8;
                                    if (!hashMapArr2[1].isEmpty()) {
                                        hashMapArr2[0].put(r7[1].A03, C15290no.A01((long) iArr[1], this.A09));
                                    }
                                    if (!hashMapArr2[2].isEmpty()) {
                                        hashMapArr2[0].put(r7[2].A03, C15290no.A01((long) iArr[2], this.A09));
                                    }
                                    if (!hashMapArr2[3].isEmpty()) {
                                        hashMapArr2[1].put(r7[3].A03, C15290no.A01((long) iArr[3], this.A09));
                                    }
                                    r4.A01((short) i8);
                                    byte[] bArr = A0P;
                                    outputStream.write(bArr);
                                    short s = 18761;
                                    if (this.A09 == ByteOrder.BIG_ENDIAN) {
                                        s = 19789;
                                    }
                                    r4.A01(s);
                                    r4.A00 = this.A09;
                                    r4.A01((short) 42);
                                    r4.A00((int) 8);
                                    for (int i9 = 0; i9 < length; i9++) {
                                        if (!hashMapArr2[i9].isEmpty()) {
                                            r4.A01((short) hashMapArr2[i9].size());
                                            HashMap hashMap = hashMapArr2[i9];
                                            int size = (hashMap.size() * 12) + iArr[i9] + 2 + 4;
                                            for (Map.Entry entry3 : hashMap.entrySet()) {
                                                int i10 = ((C15300np) A0i[i9].get(entry3.getKey())).A00;
                                                C15290no r132 = (C15290no) entry3.getValue();
                                                if (r132 != null) {
                                                    int[] iArr3 = A0V;
                                                    int i11 = r132.A00;
                                                    int i12 = iArr3[i11];
                                                    int i13 = r132.A01;
                                                    int i14 = i12 * i13;
                                                    r4.A01((short) i10);
                                                    r4.A01((short) i11);
                                                    r4.A00(i13);
                                                    if (i14 > 4) {
                                                        r4.A00((int) ((long) size));
                                                        size += i14;
                                                    } else {
                                                        outputStream.write(r132.A02);
                                                        if (i14 < 4) {
                                                            while (i14 < 4) {
                                                                outputStream.write(0);
                                                                i14++;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    throw null;
                                                }
                                            }
                                            if (i9 != 0 || hashMapArr2[4].isEmpty()) {
                                                r4.A00((int) 0);
                                            } else {
                                                r4.A00((int) ((long) iArr[4]));
                                            }
                                            for (Map.Entry entry4 : hashMapArr2[i9].entrySet()) {
                                                byte[] bArr2 = ((C15290no) entry4.getValue()).A02;
                                                int length2 = bArr2.length;
                                                if (length2 > 4) {
                                                    outputStream.write(bArr2, 0, length2);
                                                }
                                            }
                                        }
                                    }
                                    if (this.A0B) {
                                        outputStream.write(A0H());
                                    }
                                    r4.A00 = ByteOrder.BIG_ENDIAN;
                                    byte[] bArr3 = new byte[4096];
                                    while (dataInputStream.readByte() == -1) {
                                        byte readByte = dataInputStream.readByte();
                                        if (readByte == -39 || readByte == -38) {
                                            outputStream.write(-1);
                                            outputStream.write(readByte);
                                            byte[] bArr4 = new byte[8192];
                                            while (true) {
                                                int read = dataInputStream.read(bArr4);
                                                if (read != -1) {
                                                    outputStream.write(bArr4, 0, read);
                                                } else {
                                                    A02(fileInputStream2);
                                                    A02(fileOutputStream);
                                                    file.delete();
                                                    this.A0D = null;
                                                    return;
                                                }
                                            }
                                        } else if (readByte != -31) {
                                            outputStream.write(-1);
                                            outputStream.write(readByte);
                                            int readUnsignedShort = dataInputStream.readUnsignedShort();
                                            r4.A01((short) readUnsignedShort);
                                            int i15 = readUnsignedShort - 2;
                                            if (i15 >= 0) {
                                                while (i15 > 0) {
                                                    int read2 = dataInputStream.read(bArr3, 0, Math.min(i15, 4096));
                                                    if (read2 < 0) {
                                                        break;
                                                    }
                                                    outputStream.write(bArr3, 0, read2);
                                                    i15 -= read2;
                                                }
                                            } else {
                                                throw new IOException("Invalid length");
                                            }
                                        } else {
                                            int readUnsignedShort2 = dataInputStream.readUnsignedShort() - 2;
                                            if (readUnsignedShort2 >= 0) {
                                                byte[] bArr5 = new byte[6];
                                                if (readUnsignedShort2 >= 6) {
                                                    if (dataInputStream.read(bArr5) != 6) {
                                                        throw new IOException("Invalid exif");
                                                    } else if (Arrays.equals(bArr5, bArr)) {
                                                        int i16 = readUnsignedShort2 - 6;
                                                        if (dataInputStream.skipBytes(i16) != i16) {
                                                            throw new IOException("Invalid length");
                                                        }
                                                    }
                                                }
                                                outputStream.write(-1);
                                                outputStream.write(readByte);
                                                r4.A01((short) (readUnsignedShort2 + 2));
                                                if (readUnsignedShort2 >= 6) {
                                                    readUnsignedShort2 -= 6;
                                                    outputStream.write(bArr5);
                                                }
                                                while (readUnsignedShort2 > 0) {
                                                    int read3 = dataInputStream.read(bArr3, 0, Math.min(readUnsignedShort2, 4096));
                                                    if (read3 < 0) {
                                                        break;
                                                    }
                                                    outputStream.write(bArr3, 0, read3);
                                                    readUnsignedShort2 -= read3;
                                                }
                                            } else {
                                                throw new IOException("Invalid length");
                                            }
                                        }
                                    }
                                    throw new IOException("Invalid marker");
                                }
                                throw new IOException("Invalid marker");
                            }
                            throw new IOException("Invalid marker");
                        } catch (Throwable th2) {
                            th = th2;
                            fileInputStream = fileInputStream2;
                            A02(fileInputStream);
                            A02(fileOutputStream);
                            file.delete();
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        fileOutputStream = null;
                        fileInputStream = fileInputStream2;
                        A02(fileInputStream);
                        A02(fileOutputStream);
                        file.delete();
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    fileOutputStream = null;
                    A02(fileInputStream);
                    A02(fileOutputStream);
                    file.delete();
                    throw th;
                }
            } else {
                StringBuilder A0S2 = AnonymousClass008.A0S("Could not rename to ");
                A0S2.append(file.getAbsolutePath());
                throw new IOException(A0S2.toString());
            }
        } else {
            throw new IOException("ExifInterface does not support saving attributes for the current input.");
        }
    }

    public final void A06() {
        String A042 = A04("DateTimeOriginal");
        if (A042 != null && A04("DateTime") == null) {
            this.A0F[0].put("DateTime", C15290no.A02(A042));
        }
        if (A04("ImageWidth") == null) {
            this.A0F[0].put("ImageWidth", C15290no.A01(0, this.A09));
        }
        if (A04("ImageLength") == null) {
            this.A0F[0].put("ImageLength", C15290no.A01(0, this.A09));
        }
        if (A04("Orientation") == null) {
            this.A0F[0].put("Orientation", C15290no.A01(0, this.A09));
        }
        if (A04("LightSource") == null) {
            this.A0F[1].put("LightSource", C15290no.A01(0, this.A09));
        }
    }

    public final void A07(int i, int i2) {
        HashMap[] hashMapArr = this.A0F;
        HashMap hashMap = hashMapArr[i];
        if (!hashMap.isEmpty() && !hashMapArr[i2].isEmpty()) {
            C15290no r6 = (C15290no) hashMap.get("ImageLength");
            C15290no r2 = (C15290no) hashMapArr[i].get("ImageWidth");
            C15290no r1 = (C15290no) hashMapArr[i2].get("ImageLength");
            C15290no r4 = (C15290no) hashMapArr[i2].get("ImageWidth");
            if (r6 != null && r2 != null && r1 != null && r4 != null) {
                int A062 = r6.A06(this.A09);
                int A063 = r2.A06(this.A09);
                int A064 = r1.A06(this.A09);
                int A065 = r4.A06(this.A09);
                if (A062 < A064 && A063 < A065) {
                    HashMap hashMap2 = hashMapArr[i];
                    hashMapArr[i] = hashMapArr[i2];
                    hashMapArr[i2] = hashMap2;
                }
            }
        }
    }

    public final void A08(C15270nm r10) {
        C15290no r0;
        A09(r10, r10.available());
        A0A(r10, 0);
        A0B(r10, 0);
        A0B(r10, 5);
        A0B(r10, 4);
        A07(0, 5);
        A07(0, 4);
        A07(5, 4);
        HashMap[] hashMapArr = this.A0F;
        Object obj = hashMapArr[1].get("PixelXDimension");
        Object obj2 = hashMapArr[1].get("PixelYDimension");
        if (!(obj == null || obj2 == null)) {
            hashMapArr[0].put("ImageWidth", obj);
            hashMapArr[0].put("ImageLength", obj2);
        }
        if (hashMapArr[4].isEmpty() && A0G(hashMapArr[5])) {
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        if (!A0G(hashMapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        if (this.A01 == 8 && (r0 = (C15290no) hashMapArr[1].get("MakerNote")) != null) {
            C15270nm r2 = new C15270nm(new ByteArrayInputStream(r0.A02));
            r2.A02 = this.A09;
            r2.A00(6);
            A0A(r2, 9);
            Object obj3 = hashMapArr[9].get("ColorSpace");
            if (obj3 != null) {
                hashMapArr[1].put("ColorSpace", obj3);
            }
        }
    }

    public final void A09(C15270nm r4, int i) {
        ByteOrder A012 = A01(r4);
        this.A09 = A012;
        r4.A02 = A012;
        int readUnsignedShort = r4.readUnsignedShort();
        int i2 = this.A01;
        if (i2 == 7 || i2 == 10 || readUnsignedShort == 42) {
            int readInt = r4.readInt();
            if (readInt < 8 || readInt >= i) {
                throw new IOException(AnonymousClass008.A0F("Invalid first Ifd offset: ", readInt));
            }
            int i3 = readInt - 8;
            if (i3 > 0 && r4.skipBytes(i3) != i3) {
                throw new IOException(AnonymousClass008.A0F("Couldn't jump to first Ifd: ", i3));
            }
            return;
        }
        StringBuilder A0S2 = AnonymousClass008.A0S("Invalid start code: ");
        A0S2.append(Integer.toHexString(readUnsignedShort));
        throw new IOException(A0S2.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01d0, code lost:
        if (r6 == 7) goto L_0x01d2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0136  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0A(X.C15270nm r28, int r29) {
        /*
        // Method dump skipped, instructions count: 714
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15320nr.A0A(X.0nm, int):void");
    }

    public final void A0B(C15270nm r12, int i) {
        C15290no r1;
        C15290no A002;
        C15290no A003;
        HashMap[] hashMapArr = this.A0F;
        C15290no r8 = (C15290no) hashMapArr[i].get("DefaultCropSize");
        C15290no r6 = (C15290no) hashMapArr[i].get("SensorTopBorder");
        C15290no r7 = (C15290no) hashMapArr[i].get("SensorLeftBorder");
        C15290no r2 = (C15290no) hashMapArr[i].get("SensorBottomBorder");
        C15290no r13 = (C15290no) hashMapArr[i].get("SensorRightBorder");
        if (r8 != null) {
            if (r8.A00 == 5) {
                C15310nq[] r82 = (C15310nq[]) r8.A07(this.A09);
                if (r82 == null || r82.length != 2) {
                    StringBuilder A0S2 = AnonymousClass008.A0S("Invalid crop size values. cropSize=");
                    A0S2.append(Arrays.toString(r82));
                    Log.w("ExifInterface", A0S2.toString());
                    return;
                }
                A002 = C15290no.A05(new C15310nq[]{r82[0]}, this.A09);
                A003 = C15290no.A05(new C15310nq[]{r82[1]}, this.A09);
            } else {
                int[] iArr = (int[]) r8.A07(this.A09);
                if (iArr == null || iArr.length != 2) {
                    StringBuilder A0S3 = AnonymousClass008.A0S("Invalid crop size values. cropSize=");
                    A0S3.append(Arrays.toString(iArr));
                    Log.w("ExifInterface", A0S3.toString());
                    return;
                }
                A002 = C15290no.A00(iArr[0], this.A09);
                A003 = C15290no.A00(iArr[1], this.A09);
            }
            hashMapArr[i].put("ImageWidth", A002);
            hashMapArr[i].put("ImageLength", A003);
        } else if (r6 == null || r7 == null || r2 == null || r13 == null) {
            Object obj = hashMapArr[i].get("ImageLength");
            Object obj2 = hashMapArr[i].get("ImageWidth");
            if ((obj == null || obj2 == null) && (r1 = (C15290no) hashMapArr[i].get("JPEGInterchangeFormat")) != null) {
                A0C(r12, r1.A06(this.A09), i);
            }
        } else {
            int A062 = r6.A06(this.A09);
            int A063 = r2.A06(this.A09);
            int A064 = r13.A06(this.A09);
            int A065 = r7.A06(this.A09);
            if (A063 > A062 && A064 > A065) {
                C15290no A004 = C15290no.A00(A063 - A062, this.A09);
                C15290no A005 = C15290no.A00(A064 - A065, this.A09);
                hashMapArr[i].put("ImageLength", A004);
                hashMapArr[i].put("ImageWidth", A005);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b2 A[FALL_THROUGH] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00e2 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0C(X.C15270nm r10, int r11, int r12) {
        /*
        // Method dump skipped, instructions count: 396
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15320nr.A0C(X.0nm, int, int):void");
    }

    public final void A0D(C15270nm r5, HashMap hashMap) {
        int i;
        C15290no r2 = (C15290no) hashMap.get("JPEGInterchangeFormat");
        C15290no r1 = (C15290no) hashMap.get("JPEGInterchangeFormatLength");
        if (r2 != null && r1 != null) {
            int A062 = r2.A06(this.A09);
            int min = Math.min(r1.A06(this.A09), r5.available() - A062);
            int i2 = this.A01;
            if (i2 == 4 || i2 == 9 || i2 == 10) {
                i = this.A00;
            } else {
                if (i2 == 7) {
                    i = this.A02;
                }
                if (A062 > 0 && min > 0) {
                    this.A0B = true;
                    this.A08 = A062;
                    this.A07 = min;
                    if (this.A0E == null) {
                        byte[] bArr = new byte[min];
                        r5.A00((long) A062);
                        r5.readFully(bArr);
                        this.A0D = bArr;
                        return;
                    }
                    return;
                }
            }
            A062 += i;
            if (A062 > 0) {
            }
        }
    }

    public void A0E(String str) {
        C15300np r3;
        C15290no r0;
        int intValue;
        String obj;
        String str2 = str;
        String str3 = "Orientation";
        if ("ISOSpeedRatings".equals(str3)) {
            str3 = "PhotographicSensitivity";
        }
        int i = 2;
        int i2 = 1;
        if (str != null && A0M.contains(str3)) {
            if (str3.equals("GPSTimeStamp")) {
                Matcher matcher = A0N.matcher(str2);
                if (!matcher.find()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid value for ");
                    sb.append(str3);
                    sb.append(" : ");
                    sb.append(str2);
                    Log.w("ExifInterface", sb.toString());
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Integer.parseInt(matcher.group(1)));
                sb2.append("/1,");
                sb2.append(Integer.parseInt(matcher.group(2)));
                sb2.append("/1,");
                sb2.append(Integer.parseInt(matcher.group(3)));
                sb2.append("/1");
                str2 = sb2.toString();
            } else {
                try {
                    str2 = new C15310nq((long) (Double.parseDouble(str2) * 10000.0d), 10000).toString();
                } catch (NumberFormatException unused) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Invalid value for ");
                    sb3.append(str3);
                    sb3.append(" : ");
                    sb3.append(str2);
                    Log.w("ExifInterface", sb3.toString());
                    return;
                }
            }
        }
        int i3 = 0;
        int i4 = 0;
        while (i4 < A0j.length) {
            if ((i4 != 4 || this.A0B) && (r3 = (C15300np) A0i[i4].get(str3)) != null) {
                if (str2 == null) {
                    this.A0F[i4].remove(str3);
                } else {
                    Pair A002 = A00(str2);
                    int i5 = r3.A01;
                    int intValue2 = ((Number) A002.first).intValue();
                    if (!(i5 == intValue2 || i5 == (intValue = ((Number) A002.second).intValue()) || ((i5 = r3.A02) != -1 && (i5 == intValue2 || i5 == intValue)))) {
                        i5 = i5;
                        if (!(i5 == i2 || i5 == 7 || i5 == i)) {
                            StringBuilder sb4 = new StringBuilder("Given tag (");
                            sb4.append(str3);
                            sb4.append(") value didn't match with one of expected ");
                            sb4.append("formats: ");
                            String[] strArr = A0g;
                            sb4.append(strArr[i5]);
                            String str4 = "";
                            if (i5 == -1) {
                                obj = str4;
                            } else {
                                StringBuilder A0S2 = AnonymousClass008.A0S(", ");
                                A0S2.append(strArr[i5]);
                                obj = A0S2.toString();
                            }
                            sb4.append(obj);
                            sb4.append(" (guess: ");
                            sb4.append(strArr[intValue2]);
                            if (intValue != -1) {
                                StringBuilder A0S3 = AnonymousClass008.A0S(", ");
                                A0S3.append(strArr[intValue]);
                                str4 = A0S3.toString();
                            }
                            sb4.append(str4);
                            sb4.append(")");
                            Log.w("ExifInterface", sb4.toString());
                        }
                    }
                    switch (i5) {
                        case 1:
                            HashMap hashMap = this.A0F[i4];
                            if (str2.length() != i2 || str2.charAt(i3) < '0' || str2.charAt(i3) > '1') {
                                byte[] bytes = str2.getBytes(A0K);
                                r0 = new C15290no(i2, bytes.length, bytes);
                            } else {
                                byte[] bArr = new byte[i2];
                                bArr[0] = (byte) (str2.charAt(0) - '0');
                                r0 = new C15290no(i2, i2, bArr);
                            }
                            hashMap.put(str3, r0);
                            continue;
                        case 2:
                        case 7:
                            this.A0F[i4].put(str3, C15290no.A02(str2));
                            continue;
                        case 3:
                            String[] split = str2.split(",", -1);
                            int length = split.length;
                            int[] iArr = new int[length];
                            while (i3 < length) {
                                iArr[i3] = Integer.parseInt(split[i3]);
                                i3++;
                            }
                            this.A0F[i4].put(str3, C15290no.A03(iArr, this.A09));
                            continue;
                        case 4:
                            String[] split2 = str2.split(",", -1);
                            int length2 = split2.length;
                            long[] jArr = new long[length2];
                            for (int i6 = 0; i6 < length2; i6++) {
                                jArr[i6] = Long.parseLong(split2[i6]);
                            }
                            this.A0F[i4].put(str3, C15290no.A04(jArr, this.A09));
                            continue;
                        case 5:
                            String[] split3 = str2.split(",", -1);
                            int length3 = split3.length;
                            C15310nq[] r10 = new C15310nq[length3];
                            for (int i7 = 0; i7 < length3; i7++) {
                                String[] split4 = split3[i7].split("/", -1);
                                r10[i7] = new C15310nq((long) Double.parseDouble(split4[0]), (long) Double.parseDouble(split4[1]));
                            }
                            this.A0F[i4].put(str3, C15290no.A05(r10, this.A09));
                            continue;
                        case 6:
                        case 8:
                        case 11:
                        default:
                            AnonymousClass008.A0x("Data format isn't one of expected formats: ", i5, "ExifInterface");
                            continue;
                        case 9:
                            String[] split5 = str2.split(",", -1);
                            int length4 = split5.length;
                            int[] iArr2 = new int[length4];
                            while (i3 < length4) {
                                iArr2[i3] = Integer.parseInt(split5[i3]);
                                i3++;
                            }
                            HashMap hashMap2 = this.A0F[i4];
                            ByteOrder byteOrder = this.A09;
                            ByteBuffer wrap = ByteBuffer.wrap(new byte[(A0V[9] * length4)]);
                            wrap.order(byteOrder);
                            for (int i8 = 0; i8 < length4; i8++) {
                                wrap.putInt(iArr2[i8]);
                            }
                            hashMap2.put(str3, new C15290no(9, length4, wrap.array()));
                            continue;
                        case 10:
                            String[] split6 = str2.split(",", -1);
                            int length5 = split6.length;
                            C15310nq[] r102 = new C15310nq[length5];
                            int i9 = 0;
                            while (i9 < length5) {
                                String[] split7 = split6[i9].split("/", -1);
                                r102[i9] = new C15310nq((long) Double.parseDouble(split7[i3]), (long) Double.parseDouble(split7[i2]));
                                i9++;
                                i2 = 1;
                                i3 = 0;
                            }
                            HashMap hashMap3 = this.A0F[i4];
                            ByteOrder byteOrder2 = this.A09;
                            ByteBuffer wrap2 = ByteBuffer.wrap(new byte[(A0V[10] * length5)]);
                            wrap2.order(byteOrder2);
                            for (int i10 = 0; i10 < length5; i10++) {
                                C15310nq r12 = r102[i10];
                                wrap2.putInt((int) r12.A01);
                                wrap2.putInt((int) r12.A00);
                            }
                            hashMap3.put(str3, new C15290no(10, length5, wrap2.array()));
                            continue;
                        case 12:
                            String[] split8 = str2.split(",", -1);
                            int length6 = split8.length;
                            double[] dArr = new double[length6];
                            for (int i11 = 0; i11 < length6; i11++) {
                                dArr[i11] = Double.parseDouble(split8[i11]);
                            }
                            HashMap hashMap4 = this.A0F[i4];
                            ByteOrder byteOrder3 = this.A09;
                            ByteBuffer wrap3 = ByteBuffer.wrap(new byte[(A0V[12] * length6)]);
                            wrap3.order(byteOrder3);
                            for (int i12 = 0; i12 < length6; i12++) {
                                wrap3.putDouble(dArr[i12]);
                            }
                            hashMap4.put(str3, new C15290no(12, length6, wrap3.array()));
                            continue;
                    }
                }
            }
            i4++;
            i = 2;
            i3 = 0;
            i2 = 1;
        }
    }

    public final void A0F(String str) {
        for (int i = 0; i < A0j.length; i++) {
            this.A0F[i].remove(str);
        }
    }

    public final boolean A0G(HashMap hashMap) {
        C15290no r2 = (C15290no) hashMap.get("ImageLength");
        C15290no r1 = (C15290no) hashMap.get("ImageWidth");
        if (r2 == null || r1 == null) {
            return false;
        }
        return r2.A06(this.A09) <= 512 && r1.A06(this.A09) <= 512;
    }

    public byte[] A0H() {
        Throwable th;
        FileInputStream fileInputStream;
        IOException e;
        FileInputStream fileInputStream2 = null;
        if (!this.A0B) {
            return null;
        }
        byte[] bArr = this.A0D;
        if (bArr != null) {
            return bArr;
        }
        try {
            String str = this.A0E;
            fileInputStream = str != null ? new FileInputStream(str) : null;
            if (fileInputStream != null) {
                try {
                    if (fileInputStream.skip((long) this.A08) == ((long) this.A08)) {
                        byte[] bArr2 = new byte[this.A07];
                        if (fileInputStream.read(bArr2) == this.A07) {
                            this.A0D = bArr2;
                            A02(fileInputStream);
                            return bArr2;
                        }
                        throw new IOException("Corrupted image");
                    }
                    throw new IOException("Corrupted image");
                } catch (IOException e2) {
                    e = e2;
                    try {
                        Log.d("ExifInterface", "Encountered exception while getting thumbnail", e);
                        A02(fileInputStream);
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream2 = fileInputStream;
                        A02(fileInputStream2);
                        throw th;
                    }
                }
            } else {
                throw new FileNotFoundException();
            }
        } catch (IOException e3) {
            e = e3;
            fileInputStream = null;
            Log.d("ExifInterface", "Encountered exception while getting thumbnail", e);
            A02(fileInputStream);
            return null;
        } catch (Throwable th3) {
            th = th3;
            A02(fileInputStream2);
            throw th;
        }
    }
}
