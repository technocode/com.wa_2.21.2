package X;

import android.provider.ContactsContract;
import android.text.TextUtils;
import android.util.Base64;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: X.3D7  reason: invalid class name */
public class AnonymousClass3D7 {
    public int A00 = 0;
    public String A01;
    public StringBuilder A02;
    public final AnonymousClass0CO A03;
    public final AnonymousClass01X A04;

    static {
        new HashSet(Arrays.asList("CELL", "AOL", "APPLELINK", "ATTMAIL", "CIS", "EWORLD", "INTERNET", "IBMMAIL", "MCIMAIL", "POWERSHARE", "PRODIGY", "TLX", "X400"));
        new HashSet(Arrays.asList("PREF", "WORK", "HOME", "VOICE", "FAX", "MSG", "CELL", "PAGER", "BBS", "MODEM", "CAR", "ISDN", "VIDEO"));
        new HashSet(Arrays.asList("BLOG", "FTP", "HOMEPAGE", "PROFILE", "OTHER", "HOME", "WORK"));
    }

    public AnonymousClass3D7(AnonymousClass01X r2, AnonymousClass0CO r3) {
        this.A04 = r2;
        this.A03 = r3;
    }

    public static void A00(C000300f r5, AnonymousClass01A r6, AnonymousClass1Z4 r7) {
        List<AnonymousClass1Z3> list = r7.A05;
        if (list != null) {
            for (AnonymousClass1Z3 r2 : list) {
                C007003k A0C = r6.A0C(r2.A02);
                if (A0C != null) {
                    if (r5.A0D(AbstractC000400g.A2K) && A0C.A08()) {
                        AnonymousClass3D3 r1 = r7.A08;
                        r1.A08 = r1.A01;
                        String A012 = r7.A0A.A01((UserJid) A0C.A02(UserJid.class));
                        if (!TextUtils.isEmpty(A012)) {
                            r7.A01 = A012;
                        }
                    }
                    UserJid userJid = (UserJid) A0C.A02(UserJid.class);
                    if (A0C.A0X && userJid != null) {
                        r2.A01 = userJid;
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    public static final boolean A01(String str) {
        return str == null || str.trim().equals("");
    }

    public String A02(AnonymousClass1Z4 r15) {
        String str;
        String str2;
        String str3;
        String str4;
        UserJid userJid;
        String str5;
        String str6;
        String substring;
        StringBuilder sb = new StringBuilder();
        this.A02 = sb;
        AnonymousClass3D3 r2 = r15.A08;
        if (r2 != null && r2.A01 == null) {
            r2.A01 = "";
        }
        this.A01 = "\n";
        sb.append("BEGIN:VCARD");
        sb.append("\n");
        sb.append("VERSION:3.0");
        sb.append("\n");
        if (r2 != null) {
            sb.append("N:");
            String str7 = r2.A00;
            if (str7 != null) {
                sb.append(str7);
                sb.append(";");
            } else {
                sb.append(";");
            }
            String str8 = r2.A02;
            if (str8 != null) {
                sb.append(str8);
                sb.append(";");
            } else {
                sb.append(";");
            }
            String str9 = r2.A03;
            if (str9 != null) {
                sb.append(str9);
                sb.append(";");
            } else {
                sb.append(";");
            }
            String str10 = r2.A06;
            if (str10 != null) {
                sb.append(str10);
                sb.append(";");
            } else {
                sb.append(";");
            }
            String str11 = r2.A07;
            if (str11 != null) {
                sb.append(str11);
            }
            sb.append("\n");
            sb.append("FN:");
            sb.append(r2.A01);
            sb.append("\n");
        }
        Map map = r15.A07;
        if (map != null && map.containsKey("NICKNAME")) {
            StringBuilder sb2 = this.A02;
            sb2.append("NICKNAME:");
            sb2.append(((C68373Cy) ((List) r15.A07.get("NICKNAME")).get(0)).A02);
            sb2.append(this.A01);
        }
        AnonymousClass3D3 r3 = r15.A08;
        if (r3 != null) {
            String str12 = r3.A04;
            if (str12 != null) {
                StringBuilder sb3 = this.A02;
                sb3.append("X-PHONETIC-FIRST-NAME:");
                sb3.append(str12);
                sb3.append(this.A01);
            }
            String str13 = r3.A05;
            if (str13 != null) {
                StringBuilder sb4 = this.A02;
                sb4.append("X-PHONETIC-LAST-NAME:");
                sb4.append(str13);
                sb4.append(this.A01);
            }
        }
        List list = r15.A04;
        if (list != null && list.size() > 0) {
            String str14 = ((AnonymousClass3D4) r15.A04.get(0)).A00;
            String str15 = ((AnonymousClass3D4) r15.A04.get(0)).A01;
            if (str14 != null) {
                StringBuilder sb5 = this.A02;
                sb5.append("ORG:");
                sb5.append(str14);
                sb5.append(this.A01);
            }
            if (str15 != null) {
                StringBuilder sb6 = this.A02;
                sb6.append("TITLE:");
                sb6.append(str15);
                sb6.append(this.A01);
            }
        }
        if (r15.A03.size() > 0 && !A01((String) r15.A03.get(0))) {
            StringBuilder sb7 = this.A02;
            sb7.append("NOTE:");
            String str16 = (String) r15.A03.get(0);
            if (str16.endsWith("\r\n")) {
                substring = str16.substring(0, str16.length() - 2);
            } else if (str16.endsWith("\n")) {
                substring = str16.substring(0, str16.length() - 1);
            } else {
                str6 = null;
                sb7.append(str6);
                sb7.append(this.A01);
            }
            str6 = substring.replaceAll("\r\n", "\n").replaceAll("\n", "\n ");
            sb7.append(str6);
            sb7.append(this.A01);
        }
        List<AnonymousClass1Z3> list2 = r15.A05;
        if (list2 != null) {
            HashMap hashMap = new HashMap();
            for (AnonymousClass1Z3 r7 : list2) {
                if (hashMap.containsKey(r7.A02)) {
                    AnonymousClass1Z3 r1 = (AnonymousClass1Z3) hashMap.get(r7.A02);
                    int i = r1.A00;
                    if (i == -1 && r7.A00 == -1) {
                        r1.A00 = 1;
                    } else if (i == -1 || (i == 0 && r7.A00 != -1)) {
                        int i2 = r7.A00;
                        r1.A00 = i2;
                        if (i2 == 0) {
                            r1.A03 = r7.A03;
                        }
                    }
                    String str17 = r1.A03;
                    if ((str17 == null || str17.equalsIgnoreCase("null")) && (str5 = r7.A03) != null && !str5.equalsIgnoreCase("null")) {
                        r1.A03 = str5;
                    } else if (str17 == null) {
                        r1.A03 = "HOME";
                    }
                    if (r1.A04 || r7.A04) {
                        r1.A04 = true;
                    }
                    if (r1.A01 == null && (userJid = r7.A01) != null) {
                        r1.A01 = userJid;
                    }
                } else {
                    hashMap.put(r7.A02, r7);
                }
            }
            for (AnonymousClass1Z3 r10 : hashMap.values()) {
                String str18 = r10.A02;
                if (!A01(str18)) {
                    int i3 = r10.A00;
                    if (i3 == 0) {
                        int i4 = this.A00 + 1;
                        this.A00 = i4;
                        StringBuilder sb8 = this.A02;
                        sb8.append("item");
                        sb8.append(i4);
                        sb8.append(".TEL");
                        UserJid userJid2 = r10.A01;
                        if (userJid2 == null) {
                            str4 = null;
                        } else {
                            str4 = userJid2.user;
                        }
                        if (str4 != null) {
                            sb8.append(";waid=");
                            sb8.append(str4);
                        }
                        sb8.append(':');
                        sb8.append(str18);
                        String str19 = this.A01;
                        sb8.append(str19);
                        sb8.append("item");
                        sb8.append(i4);
                        sb8.append(".X-ABLabel:");
                        sb8.append(r10.A03);
                        sb8.append(str19);
                    } else {
                        String A07 = this.A04.A07(ContactsContract.CommonDataKinds.Phone.getTypeLabelResource(i3));
                        if (A07.indexOf(59) != -1) {
                            A07 = A07.replace(';', ',');
                        }
                        StringBuilder sb9 = this.A02;
                        sb9.append("TEL;type=");
                        sb9.append(A07);
                        UserJid userJid3 = r10.A01;
                        if (userJid3 == null) {
                            str3 = null;
                        } else {
                            str3 = userJid3.user;
                        }
                        if (str3 != null) {
                            sb9.append(";waid=");
                            sb9.append(str3);
                        }
                        sb9.append(':');
                        sb9.append(r10.A02);
                        sb9.append(this.A01);
                    }
                }
            }
        }
        List<AnonymousClass3D6> list3 = r15.A06;
        if (list3 != null) {
            for (AnonymousClass3D6 r102 : list3) {
                String str20 = r102.A01;
                if (!A01(str20)) {
                    int i5 = r102.A00;
                    if (i5 == 4 || i5 == 5) {
                        if (i5 == 4) {
                            str = "HOME";
                        } else {
                            str = "WORK";
                        }
                        if (str.indexOf(";") != -1) {
                            str = str.replace(";", ",");
                        }
                        StringBuilder sb10 = this.A02;
                        sb10.append("URL;type=");
                        sb10.append(str);
                        sb10.append(":");
                        sb10.append(r102.A01);
                        sb10.append(this.A01);
                    } else {
                        if (i5 != 1) {
                            str2 = i5 != 2 ? i5 != 3 ? i5 != 6 ? "OTHER" : "FTP" : "PROFILE" : "BLOG";
                        } else {
                            str2 = "HOMEPAGE";
                        }
                        int i6 = this.A00 + 1;
                        this.A00 = i6;
                        StringBuilder sb11 = this.A02;
                        sb11.append("item");
                        sb11.append(i6);
                        sb11.append(".URL:");
                        sb11.append(str20);
                        String str21 = this.A01;
                        sb11.append(str21);
                        sb11.append("item");
                        sb11.append(i6);
                        sb11.append(".X-ABLabel:");
                        sb11.append(str2);
                        sb11.append(str21);
                    }
                }
            }
        }
        List<AnonymousClass3D2> list4 = r15.A02;
        if (list4 != null) {
            for (AnonymousClass3D2 r11 : list4) {
                Class cls = r11.A01;
                if (cls == ContactsContract.CommonDataKinds.Email.class) {
                    String str22 = r11.A02;
                    if (!A01(str22)) {
                        int i7 = r11.A00;
                        if (i7 == 0) {
                            int i8 = this.A00 + 1;
                            this.A00 = i8;
                            StringBuilder sb12 = this.A02;
                            sb12.append("item");
                            sb12.append(i8);
                            sb12.append(".EMAIL;type=INTERNET:");
                            sb12.append(str22);
                            String str23 = this.A01;
                            sb12.append(str23);
                            sb12.append("item");
                            sb12.append(i8);
                            sb12.append(".X-ABLabel:");
                            sb12.append(r11.A03);
                            sb12.append(str23);
                        } else {
                            String A072 = this.A04.A07(ContactsContract.CommonDataKinds.Email.getTypeLabelResource(i7));
                            StringBuilder sb13 = this.A02;
                            sb13.append("EMAIL;TYPE=");
                            sb13.append(A072);
                            sb13.append(":");
                            sb13.append(r11.A02);
                            sb13.append(this.A01);
                        }
                    }
                } else if (cls == ContactsContract.CommonDataKinds.StructuredPostal.class) {
                    int i9 = this.A00 + 1;
                    this.A00 = i9;
                    AnonymousClass3D1 r12 = r11.A04;
                    if (r12 != null) {
                        int i10 = r11.A00;
                        if (i10 == 0) {
                            StringBuilder sb14 = this.A02;
                            sb14.append("item");
                            sb14.append(i9);
                            sb14.append(".ADR:;;");
                            sb14.append(r12.A01());
                            sb14.append(this.A01);
                            sb14.append("item");
                            sb14.append(i9);
                            sb14.append(".X-ABADR:");
                            String str24 = r12.A01;
                            if (str24 != null) {
                                try {
                                    sb14.append(this.A03.A04(str24).toLowerCase(Locale.US));
                                } catch (IOException e) {
                                    Log.e("vcardcomposer/appendwapostalstr failed isoFromNativeName", e);
                                }
                            }
                            StringBuilder sb15 = this.A02;
                            String str25 = this.A01;
                            sb15.append(str25);
                            sb15.append("item");
                            sb15.append(this.A00);
                            sb15.append(".X-ABLabel:");
                            sb15.append(r11.A03);
                            sb15.append(str25);
                        } else {
                            String A073 = this.A04.A07(ContactsContract.CommonDataKinds.StructuredPostal.getTypeLabelResource(i10));
                            StringBuilder sb16 = this.A02;
                            sb16.append("item");
                            int i11 = this.A00;
                            sb16.append(i11);
                            sb16.append(".ADR;type=");
                            sb16.append(A073);
                            sb16.append(":;;");
                            AnonymousClass3D1 r13 = r11.A04;
                            sb16.append(r13.A01());
                            sb16.append(this.A01);
                            sb16.append("item");
                            sb16.append(i11);
                            sb16.append(".X-ABADR:");
                            String str26 = r13.A01;
                            if (str26 != null) {
                                try {
                                    sb16.append(this.A03.A04(str26).toLowerCase(Locale.US));
                                } catch (IOException e2) {
                                    Log.e("vcardcomposer/appendwapostalstr failed isoFromNativeName", e2);
                                }
                            }
                            this.A02.append(this.A01);
                        }
                    } else {
                        Log.e("appendWAPostalStr addr_data is NULL");
                    }
                }
            }
        }
        Map map2 = r15.A07;
        if (map2 != null && map2.containsKey("BDAY")) {
            StringBuilder sb17 = this.A02;
            sb17.append("BDAY;value=date:");
            sb17.append(((C68373Cy) ((List) r15.A07.get("BDAY")).get(0)).A02);
            sb17.append(this.A01);
        }
        Map map3 = r15.A07;
        if (map3 != null) {
            for (String str27 : map3.keySet()) {
                if (AnonymousClass1Z4.A0G.containsKey(str27)) {
                    C68373Cy r5 = (C68373Cy) ((List) r15.A07.get(str27)).get(0);
                    StringBuilder sb18 = this.A02;
                    sb18.append(str27);
                    sb18.append(";");
                    Set set = r5.A04;
                    if (set == null || set.size() <= 0) {
                        StringBuilder sb19 = this.A02;
                        sb19.append("type=HOME");
                        sb19.append(":");
                    } else {
                        StringBuilder sb20 = this.A02;
                        sb20.append("type=");
                        sb20.append(r5.A04.toArray()[0]);
                        sb20.append(":");
                    }
                    StringBuilder sb21 = this.A02;
                    sb21.append(r5.A02);
                    sb21.append(this.A01);
                }
            }
        }
        byte[] bArr = r15.A09;
        if (bArr != null) {
            StringBuilder sb22 = this.A02;
            sb22.append("PHOTO;BASE64:");
            sb22.append(Base64.encodeToString(bArr, 2));
            sb22.append(this.A01);
        }
        if (!TextUtils.isEmpty(r15.A08.A08)) {
            String str28 = r15.A01;
            if (str28 != null && str28.length() > 0) {
                StringBuilder sb23 = this.A02;
                StringBuilder A0S = AnonymousClass008.A0S("X-WA-BIZ-DESCRIPTION:");
                A0S.append(str28);
                sb23.append(A0S.toString());
                sb23.append(this.A01);
            }
            StringBuilder sb24 = this.A02;
            StringBuilder A0S2 = AnonymousClass008.A0S("X-WA-BIZ-NAME:");
            A0S2.append(r15.A08.A08);
            sb24.append(A0S2.toString());
            sb24.append(this.A01);
        }
        StringBuilder sb25 = this.A02;
        sb25.append("END:VCARD");
        return sb25.toString();
    }
}
