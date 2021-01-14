package X;

import android.text.TextUtils;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.0Sk  reason: invalid class name and case insensitive filesystem */
public final class C06250Sk {
    public final AnonymousClass0Sj A00;

    public C06250Sk(AnonymousClass0Sj r1) {
        this.A00 = r1;
    }

    public static final void A00(String str) {
        if (str == null) {
            throw new IllegalStateException();
        }
        throw new IllegalStateException(str);
    }

    public final void A01(String str) {
        if (this.A00 != null) {
            if (str == null) {
                str = "";
            }
            A00(str);
            throw null;
        }
        throw null;
    }

    public void A02(String str, double d, double d2) {
        if (Double.compare(d, d2) != 0 && Math.abs(d - d2) > 1.0E-9d) {
            A01(str);
            throw null;
        }
    }

    public void A03(String str, Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return;
            }
        } else if (obj.equals(obj2)) {
            return;
        }
        A01(str);
        throw null;
    }

    public void A04(String str, Object obj, Object obj2, Set set) {
        String str2;
        BigDecimal bigDecimal;
        ArrayList arrayList;
        if (obj != obj2) {
            if (obj == obj2) {
                arrayList = Collections.emptyList();
            } else {
                if (obj == null) {
                    str2 = "expected object is null";
                } else if (obj2 == null) {
                    str2 = "actual object is null";
                } else {
                    Class<?> cls = obj.getClass();
                    if (cls != obj2.getClass()) {
                        arrayList = Collections.singletonList("cannot compare objects of different types");
                    } else if (obj instanceof AnonymousClass0OJ) {
                        AnonymousClass0OJ r11 = (AnonymousClass0OJ) obj;
                        AnonymousClass0OJ r12 = (AnonymousClass0OJ) obj2;
                        if (r11 == r12) {
                            arrayList = Collections.emptyList();
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            if (!set.contains("buttonId") && r11.A00 != r12.A00) {
                                arrayList2.add("buttonId");
                            }
                            if (!set.contains("selectedIndex") && r11.A02 != r12.A02) {
                                arrayList2.add("selectedIndex");
                            }
                            if (!set.contains("used") && r11.A01 != r12.A01) {
                                arrayList2.add("used");
                            }
                            if (!set.contains("type") && r11.A03 != r12.A03) {
                                arrayList2.add("type");
                            }
                            if (!set.contains("buttonText") && !r11.A04.equals(r12.A04)) {
                                arrayList2.add("buttonText");
                            }
                            arrayList = arrayList2;
                            if (!set.contains("extraData")) {
                                arrayList = arrayList2;
                                if (!r11.A05.equals(r12.A05)) {
                                    arrayList2.add("extraData");
                                    arrayList = arrayList2;
                                }
                            }
                        }
                    } else if (obj instanceof AnonymousClass0OF) {
                        AnonymousClass0OF r112 = (AnonymousClass0OF) obj;
                        AnonymousClass0OF r122 = (AnonymousClass0OF) obj2;
                        if (r112 == r122) {
                            arrayList = Collections.emptyList();
                        } else {
                            ArrayList arrayList3 = new ArrayList();
                            if (!set.contains("content") && !r112.A00.equals(r122.A00)) {
                                arrayList3.add("content");
                            }
                            if (!set.contains("templateButtons") && !C006803i.A0q(r112.A02, r122.A02)) {
                                arrayList3.add("templateButtons");
                            }
                            arrayList = arrayList3;
                            if (!set.contains("footer")) {
                                arrayList = arrayList3;
                                if (!C003701u.A0F(r112.A01, r122.A01)) {
                                    arrayList3.add("footer");
                                    arrayList = arrayList3;
                                }
                            }
                        }
                    } else if (obj instanceof AnonymousClass2LW) {
                        AnonymousClass2LW r113 = (AnonymousClass2LW) obj;
                        AnonymousClass2LW r123 = (AnonymousClass2LW) obj2;
                        if (r113 == r123) {
                            arrayList = Collections.emptyList();
                        } else {
                            ArrayList arrayList4 = new ArrayList();
                            if (!set.contains("srcOrDst") && r113.A00 != r123.A00) {
                                arrayList4.add("srcOrDst");
                            }
                            if (!set.contains("splitAmount") && !C006803i.A0q(r113.A02, r123.A02)) {
                                arrayList4.add("splitAmount");
                            }
                            arrayList = arrayList4;
                            if (!set.contains("method")) {
                                arrayList = arrayList4;
                                if (!C006803i.A0q(r113.A01, r123.A01)) {
                                    arrayList4.add("method");
                                    arrayList = arrayList4;
                                }
                            }
                        }
                    } else if (obj instanceof AnonymousClass0MH) {
                        AnonymousClass0MH r114 = (AnonymousClass0MH) obj;
                        AnonymousClass0MH r124 = (AnonymousClass0MH) obj2;
                        if (r114 == r124) {
                            arrayList = Collections.emptyList();
                        } else {
                            ArrayList arrayList5 = new ArrayList();
                            if (!set.contains("status") && r114.A01 != r124.A01) {
                                arrayList5.add("status");
                            }
                            if (!set.contains("type") && r114.A02 != r124.A02) {
                                arrayList5.add("type");
                            }
                            if (!set.contains("initTs") && r114.A04 != r124.A04) {
                                arrayList5.add("initTs");
                            }
                            if (!set.contains("updateTs") && r114.A05 != r124.A05) {
                                arrayList5.add("updateTs");
                            }
                            if (!set.contains("isInterop") && r114.A0L != r124.A0L) {
                                arrayList5.add("isInterop");
                            }
                            if (!set.contains("msgKeyFromMe") && r114.A0M != r124.A0M) {
                                arrayList5.add("msgKeyFromMe");
                            }
                            if (!set.contains("isDirty") && r114.A0H() != r124.A0H()) {
                                arrayList5.add("isDirty");
                            }
                            if (!set.contains("version") && r114.A03 != r124.A03) {
                                arrayList5.add("version");
                            }
                            if (!set.contains("id") && !C003701u.A0F(r114.A0G, r124.A0G)) {
                                arrayList5.add("id");
                            }
                            if (!set.contains("errorCode") && !C003701u.A0F(r114.A0F, r124.A0F)) {
                                arrayList5.add("errorCode");
                            }
                            if (!set.contains("credentialId") && !C003701u.A0F(r114.A0D, r124.A0D)) {
                                arrayList5.add("credentialId");
                            }
                            if (!set.contains("bankTransactionId") && !C003701u.A0F(r114.A0B, r124.A0B)) {
                                arrayList5.add("bankTransactionId");
                            }
                            if (!set.contains("senderJid") && !C006803i.A0q(r114.A0A, r124.A0A)) {
                                arrayList5.add("senderJid");
                            }
                            if (!set.contains("receiverJid") && !C006803i.A0q(r114.A09, r124.A09)) {
                                arrayList5.add("receiverJid");
                            }
                            if (!set.contains("amount") && !C006803i.A0q(r114.A06, r124.A06)) {
                                arrayList5.add("amount");
                            }
                            if (!set.contains("currencyCode") && !r114.A0E.equals(r124.A0E)) {
                                arrayList5.add("currencyCode");
                            }
                            if (!set.contains("methods") && !C006803i.A0q(r114.A0J, r124.A0J)) {
                                arrayList5.add("methods");
                            }
                            if (!set.contains("msgKeyId") && !C003701u.A0F(r114.A0H, r124.A0H)) {
                                arrayList5.add("msgKeyId");
                            }
                            if (!set.contains("msgKeyRemoteJid") && !C006803i.A0q(r114.A08, r124.A08)) {
                                arrayList5.add("msgKeyRemoteJid");
                            }
                            if (!set.contains("reqMsgKeyId") && !C003701u.A0F(r114.A0I, r124.A0I)) {
                                arrayList5.add("reqMsgKeyId");
                            }
                            if (!set.contains("countryData") && !C006803i.A0q(r114.A07, r124.A07)) {
                                arrayList5.add("countryData");
                            }
                            if (!set.contains("country") && !r114.A0C.equals(r124.A0C)) {
                                arrayList5.add("country");
                            }
                            arrayList = arrayList5;
                            if (!set.contains("futureData")) {
                                arrayList = arrayList5;
                                if (!Arrays.equals(r114.A0N, r124.A0N)) {
                                    arrayList5.add("futureData");
                                    arrayList = arrayList5;
                                }
                            }
                        }
                    } else if (obj instanceof C12220hk) {
                        C12220hk r115 = (C12220hk) obj;
                        C12220hk r125 = (C12220hk) obj2;
                        if (r115 == r125) {
                            arrayList = Collections.emptyList();
                        } else {
                            ArrayList arrayList6 = new ArrayList(C002001d.A24(r115, r125, set));
                            if (!set.contains("totalBytes") && !C003701u.A0F(r115.A0J(), r125.A0J())) {
                                arrayList6.add("totalBytes");
                            }
                            if (!set.contains("callDuration") && r115.A00 != r125.A00) {
                                arrayList6.add("callDuration");
                            }
                            if (!set.contains("callResult") && ((long) r115.A01) != ((long) r125.A01)) {
                                arrayList6.add("callResult");
                            }
                            arrayList = arrayList6;
                            if (!set.contains("legacyCallLog")) {
                                arrayList = arrayList6;
                                if (!C006803i.A0q(r115.A0u(), r125.A0u())) {
                                    arrayList6.add("legacyCallLog");
                                    arrayList = arrayList6;
                                }
                            }
                        }
                    } else if (obj instanceof AnonymousClass0ZH) {
                        AnonymousClass0ZH r116 = (AnonymousClass0ZH) obj;
                        AnonymousClass0ZH r126 = (AnonymousClass0ZH) obj2;
                        if (r116 == r126) {
                            arrayList = Collections.emptyList();
                        } else {
                            ArrayList arrayList7 = new ArrayList(C002001d.A24(r116, r126, set));
                            if (!set.contains("isVideoCall") && r116.A0y() != r126.A0y()) {
                                arrayList7.add("isVideoCall");
                            }
                            arrayList = arrayList7;
                            if (!set.contains("legacyCallLog")) {
                                arrayList = arrayList7;
                                if (!C006803i.A0q(r116.A0u(), r126.A0u())) {
                                    arrayList7.add("legacyCallLog");
                                    arrayList = arrayList7;
                                }
                            }
                        }
                    } else if (obj instanceof AnonymousClass287) {
                        AnonymousClass287 r117 = (AnonymousClass287) obj;
                        AnonymousClass287 r127 = (AnonymousClass287) obj2;
                        if (r117 == r127) {
                            arrayList = Collections.emptyList();
                        } else {
                            ArrayList arrayList8 = new ArrayList(C002001d.A28(r117, r127, set));
                            arrayList = arrayList8;
                            if (!set.contains("syncdKeyIds")) {
                                arrayList = arrayList8;
                                if (!Collections.unmodifiableSet(r117.A00).equals(Collections.unmodifiableSet(r127.A00))) {
                                    arrayList8.add("syncdKeyIds");
                                    arrayList = arrayList8;
                                }
                            }
                        }
                    } else if (obj instanceof AnonymousClass288) {
                        AnonymousClass288 r118 = (AnonymousClass288) obj;
                        AnonymousClass288 r128 = (AnonymousClass288) obj2;
                        if (r118 == r128) {
                            arrayList = Collections.emptyList();
                        } else {
                            ArrayList arrayList9 = new ArrayList(C002001d.A28(r118, r128, set));
                            if (!set.contains("isNewlyGeneratedKey") && r118.A00 != r128.A00) {
                                arrayList9.add("isNewlyGeneratedKey");
                            }
                            arrayList = arrayList9;
                            if (!set.contains("syncdKeys")) {
                                HashSet hashSet = new HashSet(r118.A01.values());
                                hashSet.remove(null);
                                HashSet hashSet2 = new HashSet(r128.A01.values());
                                hashSet2.remove(null);
                                arrayList = arrayList9;
                                if (!hashSet.equals(hashSet2)) {
                                    arrayList9.add("syncdKeys");
                                    arrayList = arrayList9;
                                }
                            }
                        }
                    } else if (obj instanceof AnonymousClass28D) {
                        AnonymousClass28D r119 = (AnonymousClass28D) obj;
                        AnonymousClass28D r129 = (AnonymousClass28D) obj2;
                        if (r119 == r129) {
                            arrayList = Collections.emptyList();
                        } else {
                            ArrayList arrayList10 = new ArrayList(C002001d.A28(r119, r129, set));
                            if (!set.contains("fileLength") && r119.A04 != r129.A04) {
                                arrayList10.add("fileLength");
                            }
                            if (!set.contains("chunkOrder") && r119.A00 != r129.A00) {
                                arrayList10.add("chunkOrder");
                            }
                            if (!set.contains("progress") && r119.A01 != r129.A01) {
                                arrayList10.add("progress");
                            }
                            if (!set.contains("syncType") && r119.A03 != r129.A03) {
                                arrayList10.add("syncType");
                            }
                            if (!set.contains("reties") && r119.A02 != r129.A02) {
                                arrayList10.add("reties");
                            }
                            if (!set.contains("latestMsgId") && r119.A05 != r129.A05) {
                                arrayList10.add("latestMsgId");
                            }
                            if (!set.contains("oldestMsgId") && r119.A06 != r129.A06) {
                                arrayList10.add("oldestMsgId");
                            }
                            if (!set.contains("oldestMsgIdToSync") && r119.A07 != r129.A07) {
                                arrayList10.add("oldestMsgId");
                            }
                            if (!set.contains("directPath") && !C003701u.A0F(r119.A08, r129.A08)) {
                                arrayList10.add("directPath");
                            }
                            if (!set.contains("mediaHash") && !C003701u.A0F(r119.A0A, r129.A0A)) {
                                arrayList10.add("mediaHash");
                            }
                            if (!set.contains("mediaEncHash") && !C003701u.A0F(r119.A09, r129.A09)) {
                                arrayList10.add("mediaEncHash");
                            }
                            if (!set.contains("mediaKeyData") && !Arrays.equals(r119.A0C, r129.A0C)) {
                                arrayList10.add("mediaKeyData");
                            }
                            arrayList = arrayList10;
                            if (!set.contains("originalMessageId")) {
                                arrayList = arrayList10;
                                if (!C003701u.A0F(r119.A0B, r129.A0B)) {
                                    arrayList10.add("originalMessageId");
                                    arrayList = arrayList10;
                                }
                            }
                        }
                    } else if (obj instanceof AnonymousClass28E) {
                        AnonymousClass28E r1110 = (AnonymousClass28E) obj;
                        AnonymousClass28E r1210 = (AnonymousClass28E) obj2;
                        if (r1110 == r1210) {
                            arrayList = Collections.emptyList();
                        } else {
                            ArrayList arrayList11 = new ArrayList(C002001d.A28(r1110, r1210, set));
                            arrayList = arrayList11;
                            if (!set.contains("securityNotificationEnabled")) {
                                arrayList = arrayList11;
                                if (r1110.A00 != r1210.A00) {
                                    arrayList11.add("securityNotificationEnabled");
                                    arrayList = arrayList11;
                                }
                            }
                        }
                    } else if (obj instanceof C12210hj) {
                        C12210hj r1111 = (C12210hj) obj;
                        C12210hj r1211 = (C12210hj) obj2;
                        if (r1111 == r1211) {
                            arrayList = Collections.emptyList();
                        } else {
                            ArrayList arrayList12 = new ArrayList(C002001d.A27(r1111, r1211, set));
                            if (!set.contains("businessOwnerJid") && !C006803i.A0q(r1111.A00, r1211.A00)) {
                                arrayList12.add("businessOwnerJid");
                            }
                            if (!set.contains("title") && !C003701u.A0F(r1111.A02, r1211.A02)) {
                                arrayList12.add("title");
                            }
                            arrayList = arrayList12;
                            if (!set.contains("description")) {
                                arrayList = arrayList12;
                                if (!C003701u.A0F(r1111.A01, r1211.A01)) {
                                    arrayList12.add("description");
                                    arrayList = arrayList12;
                                }
                            }
                        }
                    } else if (obj instanceof AnonymousClass0ZA) {
                        AnonymousClass0ZA r1112 = (AnonymousClass0ZA) obj;
                        AnonymousClass0ZA r1212 = (AnonymousClass0ZA) obj2;
                        if (r1112 == r1212) {
                            arrayList = Collections.emptyList();
                        } else {
                            ArrayList arrayList13 = new ArrayList(C002001d.A27(r1112, r1212, set));
                            if (!set.contains("itemCount") && r1112.A00 != r1212.A00) {
                                arrayList13.add("itemCount");
                            }
                            if (!set.contains("orderStatus") && r1112.A01 != r1212.A01) {
                                arrayList13.add("orderStatus");
                            }
                            if (!set.contains("orderSurface") && r1112.A02 != r1212.A02) {
                                arrayList13.add("orderSurface");
                            }
                            if (!set.contains("orderId") && !C003701u.A0F(r1112.A05, r1212.A05)) {
                                arrayList13.add("orderId");
                            }
                            if (!set.contains("orderTitle") && !C003701u.A0F(r1112.A06, r1212.A06)) {
                                arrayList13.add("orderTitle");
                            }
                            if (!set.contains("message") && !C003701u.A0F(r1112.A04, r1212.A04)) {
                                arrayList13.add("message");
                            }
                            if (!set.contains("sellerJid") && !C006803i.A0q(r1112.A03, r1212.A03)) {
                                arrayList13.add("sellerJid");
                            }
                            arrayList = arrayList13;
                            if (!set.contains("token")) {
                                arrayList = arrayList13;
                                if (!C003701u.A0F(r1112.A07, r1212.A07)) {
                                    arrayList13.add("token");
                                    arrayList = arrayList13;
                                }
                            }
                        }
                    } else if (obj instanceof AnonymousClass0Z9) {
                        AnonymousClass0Z9 r1113 = (AnonymousClass0Z9) obj;
                        AnonymousClass0Z9 r1213 = (AnonymousClass0Z9) obj2;
                        if (r1113 == r1213) {
                            arrayList = Collections.emptyList();
                        } else {
                            ArrayList arrayList14 = new ArrayList(C002001d.A27(r1113, r1213, set));
                            if (!set.contains("productImageCount") && r1113.A00 != r1213.A00) {
                                arrayList14.add("productImageCount");
                            }
                            if (!set.contains("businessOwnerJid") && !C006803i.A0q(r1113.A01, r1213.A01)) {
                                arrayList14.add("businessOwnerJid");
                            }
                            if (!set.contains("productId") && !C003701u.A0F(r1113.A04, r1213.A04)) {
                                arrayList14.add("productId");
                            }
                            if (!set.contains("title") && !C003701u.A0F(r1113.A07, r1213.A07)) {
                                arrayList14.add("title");
                            }
                            if (!set.contains("description") && !C003701u.A0F(r1113.A03, r1213.A03)) {
                                arrayList14.add("description");
                            }
                            if (!set.contains("currencyCode") && !C003701u.A0F(r1113.A02, r1213.A02)) {
                                arrayList14.add("currencyCode");
                            }
                            if (!set.contains("priceAmount")) {
                                BigDecimal bigDecimal2 = r1113.A08;
                                if (bigDecimal2 == null || (bigDecimal = r1213.A08) == null) {
                                    if (!(bigDecimal2 == null && r1213.A08 == null)) {
                                        arrayList14.add("priceAmount");
                                    }
                                } else if (bigDecimal2.compareTo(bigDecimal) != 0) {
                                    arrayList14.add("priceAmount");
                                }
                            }
                            if (!set.contains("retailerId") && !C003701u.A0F(r1113.A06, r1213.A06)) {
                                arrayList14.add("retailerId");
                            }
                            arrayList = arrayList14;
                            if (!set.contains("productUrl")) {
                                arrayList = arrayList14;
                                if (!C003701u.A0F(r1113.A05, r1213.A05)) {
                                    arrayList14.add("productUrl");
                                    arrayList = arrayList14;
                                }
                            }
                        }
                    } else if (obj instanceof AnonymousClass2A6) {
                        AnonymousClass2A6 r1114 = (AnonymousClass2A6) obj;
                        AnonymousClass2A6 r1214 = (AnonymousClass2A6) obj2;
                        if (r1114 == r1214) {
                            arrayList = Collections.emptyList();
                        } else {
                            ArrayList arrayList15 = new ArrayList(C002001d.A25(r1114, r1214, set));
                            arrayList = arrayList15;
                            if (!set.contains("templateInfo")) {
                                arrayList = arrayList15;
                                if (!C006803i.A0q(r1114.A00, r1214.A00)) {
                                    arrayList15.add("templateInfo");
                                    arrayList = arrayList15;
                                }
                            }
                        }
                    } else if (obj instanceof AnonymousClass2CE) {
                        AnonymousClass2CE r1115 = (AnonymousClass2CE) obj;
                        AnonymousClass2CE r1215 = (AnonymousClass2CE) obj2;
                        if (r1115 == r1215) {
                            arrayList = Collections.emptyList();
                        } else {
                            ArrayList arrayList16 = new ArrayList(C002001d.A27(r1115, r1215, set));
                            arrayList = arrayList16;
                            if (!set.contains("templateInfo")) {
                                arrayList = arrayList16;
                                if (!C006803i.A0q(r1115.A00, r1215.A00)) {
                                    arrayList16.add("templateInfo");
                                    arrayList = arrayList16;
                                }
                            }
                        }
                    } else if (obj instanceof AnonymousClass2B4) {
                        AnonymousClass2B4 r1116 = (AnonymousClass2B4) obj;
                        AnonymousClass2B4 r1216 = (AnonymousClass2B4) obj2;
                        if (r1116 == r1216) {
                            arrayList = Collections.emptyList();
                        } else {
                            ArrayList arrayList17 = new ArrayList(C002001d.A27(r1116, r1216, set));
                            arrayList = arrayList17;
                            if (!set.contains("templateInfo")) {
                                arrayList = arrayList17;
                                if (!C006803i.A0q(r1116.A00, r1216.A00)) {
                                    arrayList17.add("templateInfo");
                                    arrayList = arrayList17;
                                }
                            }
                        }
                    } else if (obj instanceof AnonymousClass2CF) {
                        AnonymousClass2CF r1117 = (AnonymousClass2CF) obj;
                        AnonymousClass2CF r1217 = (AnonymousClass2CF) obj2;
                        if (r1117 == r1217) {
                            arrayList = Collections.emptyList();
                        } else {
                            ArrayList arrayList18 = new ArrayList(C002001d.A27(r1117, r1217, set));
                            arrayList = arrayList18;
                            if (!set.contains("templateInfo")) {
                                arrayList = arrayList18;
                                if (!C006803i.A0q(r1117.A00, r1217.A00)) {
                                    arrayList18.add("templateInfo");
                                    arrayList = arrayList18;
                                }
                            }
                        }
                    } else if (obj instanceof AnonymousClass0MN) {
                        AnonymousClass0MN r1118 = (AnonymousClass0MN) obj;
                        AnonymousClass0MN r1218 = (AnonymousClass0MN) obj2;
                        if (r1118 == r1218) {
                            arrayList = Collections.emptyList();
                        } else {
                            ArrayList arrayList19 = new ArrayList(C002001d.A27(r1118, r1218, set));
                            arrayList = arrayList19;
                            if (!set.contains("viewState")) {
                                arrayList = arrayList19;
                                if (r1118.A00 != r1218.A00) {
                                    arrayList19.add("viewState");
                                    arrayList = arrayList19;
                                }
                            }
                        }
                    } else if (obj instanceof AnonymousClass0MK) {
                        AnonymousClass0MK r1119 = (AnonymousClass0MK) obj;
                        AnonymousClass0MK r1219 = (AnonymousClass0MK) obj2;
                        if (r1119 == r1219) {
                            arrayList = Collections.emptyList();
                        } else {
                            ArrayList arrayList20 = new ArrayList(C002001d.A27(r1119, r1219, set));
                            arrayList = arrayList20;
                            if (!set.contains("viewState")) {
                                arrayList = arrayList20;
                                if (r1119.A00 != r1219.A00) {
                                    arrayList20.add("viewState");
                                    arrayList = arrayList20;
                                }
                            }
                        }
                    } else if (obj instanceof AnonymousClass0M2) {
                        arrayList = C002001d.A25((AnonymousClass0M2) obj, (AnonymousClass0M2) obj2, set);
                    } else if (obj instanceof AnonymousClass0ZE) {
                        AnonymousClass0ZE r1120 = (AnonymousClass0ZE) obj;
                        AnonymousClass0ZE r1220 = (AnonymousClass0ZE) obj2;
                        if (r1120 == r1220) {
                            arrayList = Collections.emptyList();
                        } else {
                            ArrayList arrayList21 = new ArrayList(C002001d.A27(r1120, r1220, set));
                            arrayList = arrayList21;
                            if (!set.contains("isAnimated")) {
                                arrayList = arrayList21;
                                if (r1120.A00 != r1220.A00) {
                                    arrayList21.add("isAnimated");
                                    arrayList = arrayList21;
                                }
                            }
                        }
                    } else if (obj instanceof C04830Lz) {
                        C04830Lz r1121 = (C04830Lz) obj;
                        C04830Lz r1221 = (C04830Lz) obj2;
                        if (r1121 == r1221) {
                            arrayList = Collections.emptyList();
                        } else {
                            ArrayList arrayList22 = new ArrayList(C002001d.A23(r1121, r1221, set));
                            if (!set.contains("displayName") && !C003701u.A0F(r1121.A00, r1221.A00)) {
                                arrayList22.add("displayName");
                            }
                            arrayList = arrayList22;
                            if (!set.contains("vcard")) {
                                arrayList = arrayList22;
                                if (!C003701u.A0F(r1121.A0u(), r1221.A0u())) {
                                    arrayList22.add("vcard");
                                    arrayList = arrayList22;
                                }
                            }
                        }
                    } else if (obj instanceof AnonymousClass0M1) {
                        AnonymousClass0M1 r1122 = (AnonymousClass0M1) obj;
                        AnonymousClass0M1 r1222 = (AnonymousClass0M1) obj2;
                        if (r1122 == r1222) {
                            arrayList = Collections.emptyList();
                        } else {
                            ArrayList arrayList23 = new ArrayList(C002001d.A23(r1122, r1222, set));
                            if (!set.contains("displayName") && !C003701u.A0F(r1122.A00, r1222.A00)) {
                                arrayList23.add("displayName");
                            }
                            arrayList = arrayList23;
                            if (!set.contains("contacts")) {
                                arrayList = arrayList23;
                                if (!C002001d.A3g(r1122.A0u(), r1222.A0u())) {
                                    arrayList23.add("contacts");
                                    arrayList = arrayList23;
                                }
                            }
                        }
                    } else if (obj instanceof C12190hh) {
                        C12190hh r1123 = (C12190hh) obj;
                        C12190hh r1223 = (C12190hh) obj2;
                        if (r1123 == r1223) {
                            arrayList = Collections.emptyList();
                        } else {
                            ArrayList arrayList24 = new ArrayList(C002001d.A23(r1123, r1223, set));
                            arrayList = arrayList24;
                            if (!set.contains("ephemeralSettingDuration")) {
                                arrayList = arrayList24;
                                if (r1123.A00 != r1223.A00) {
                                    arrayList24.add("ephemeralSettingDuration");
                                    arrayList = arrayList24;
                                }
                            }
                        }
                    } else if (obj instanceof AnonymousClass0ZI) {
                        AnonymousClass0ZI r1124 = (AnonymousClass0ZI) obj;
                        AnonymousClass0ZI r1224 = (AnonymousClass0ZI) obj2;
                        if (r1124 == r1224) {
                            arrayList = Collections.emptyList();
                        } else {
                            ArrayList arrayList25 = new ArrayList(C002001d.A23(r1124, r1224, set));
                            arrayList = arrayList25;
                            if (!set.contains("version")) {
                                arrayList = arrayList25;
                                if (r1124.A00 != r1224.A00) {
                                    arrayList25.add("version");
                                    arrayList = arrayList25;
                                }
                            }
                        }
                    } else if (obj instanceof AnonymousClass0ZF) {
                        AnonymousClass0ZF r1125 = (AnonymousClass0ZF) obj;
                        AnonymousClass0ZF r1225 = (AnonymousClass0ZF) obj2;
                        if (r1125 == r1225) {
                            arrayList = Collections.emptyList();
                        } else {
                            ArrayList arrayList26 = new ArrayList(C002001d.A23(r1125, r1225, set));
                            if (!set.contains("expiration") && r1125.A00 != r1225.A00) {
                                arrayList26.add("expiration");
                            }
                            if (!set.contains("expired") && r1125.A06 != r1225.A06) {
                                arrayList26.add("expired");
                            }
                            if (!set.contains("adminJidObject") && !C006803i.A0q(r1125.A02, r1225.A02)) {
                                arrayList26.add("adminJidObject");
                            }
                            if (!set.contains("groupJidObject") && !C006803i.A0q(r1125.A01, r1225.A01)) {
                                arrayList26.add("groupJidObject");
                            }
                            if (!set.contains("groupName") && !C003701u.A0F(r1125.A04, r1225.A04)) {
                                arrayList26.add("groupName");
                            }
                            if (!set.contains("inviteHash") && !C003701u.A0F(r1125.A05, r1225.A05)) {
                                arrayList26.add("inviteHash");
                            }
                            arrayList = arrayList26;
                            if (!set.contains("caption")) {
                                arrayList = arrayList26;
                                if (!C003701u.A0F(r1125.A03, r1225.A03)) {
                                    arrayList26.add("caption");
                                    arrayList = arrayList26;
                                }
                            }
                        }
                    } else if (obj instanceof C02850Ds) {
                        C02850Ds r1126 = (C02850Ds) obj;
                        C02850Ds r1226 = (C02850Ds) obj2;
                        if (r1126 == r1226) {
                            arrayList = Collections.emptyList();
                        } else {
                            ArrayList arrayList27 = new ArrayList(C002001d.A26(r1126, r1226, set));
                            if (!set.contains("shareDuration") && r1126.A00 != r1226.A00) {
                                arrayList27.add("shareDuration");
                            }
                            if (!set.contains("sequenceNumber") && r1126.A01 != r1226.A01) {
                                arrayList27.add("sequenceNumber");
                            }
                            if (!set.contains("caption") && !C003701u.A0F(r1126.A03, r1226.A03)) {
                                arrayList27.add("caption");
                            }
                            arrayList = arrayList27;
                            if (!set.contains("finalLocation")) {
                                arrayList = arrayList27;
                                if (!C006803i.A0q(r1126.A02, r1226.A02)) {
                                    arrayList27.add("finalLocation");
                                    arrayList = arrayList27;
                                }
                            }
                        }
                    } else if (obj instanceof AnonymousClass2A7) {
                        AnonymousClass2A7 r1127 = (AnonymousClass2A7) obj;
                        AnonymousClass2A7 r1227 = (AnonymousClass2A7) obj2;
                        if (r1127 == r1227) {
                            arrayList = Collections.emptyList();
                        } else {
                            ArrayList arrayList28 = new ArrayList(C002001d.A29(r1127, r1227, set));
                            arrayList = arrayList28;
                            if (!set.contains("templateInfo")) {
                                arrayList = arrayList28;
                                if (!C006803i.A0q(r1127.A00, r1227.A00)) {
                                    arrayList28.add("templateInfo");
                                    arrayList = arrayList28;
                                }
                            }
                        }
                    } else if (obj instanceof C05470Or) {
                        arrayList = C002001d.A29((C05470Or) obj, (C05470Or) obj2, set);
                    } else if (obj instanceof AnonymousClass0ZN) {
                        AnonymousClass0ZN r1128 = (AnonymousClass0ZN) obj;
                        AnonymousClass0ZN r1228 = (AnonymousClass0ZN) obj2;
                        if (r1128 == r1228) {
                            arrayList = Collections.emptyList();
                        } else {
                            ArrayList arrayList29 = new ArrayList(C002001d.A23(r1128, r1228, set));
                            arrayList = arrayList29;
                            if (!set.contains("selectListContent")) {
                                arrayList = arrayList29;
                                if (!C006803i.A0q(r1128.A00, r1228.A00)) {
                                    arrayList29.add("selectListContent");
                                    arrayList = arrayList29;
                                }
                            }
                        }
                    } else if (obj instanceof AnonymousClass0ZL) {
                        AnonymousClass0ZL r1129 = (AnonymousClass0ZL) obj;
                        AnonymousClass0ZL r1229 = (AnonymousClass0ZL) obj2;
                        if (r1129 == r1229) {
                            arrayList = Collections.emptyList();
                        } else {
                            ArrayList arrayList30 = new ArrayList(C002001d.A23(r1129, r1229, set));
                            arrayList = arrayList30;
                            if (!set.contains("paymentRequestResponseMessageId")) {
                                arrayList = arrayList30;
                                if (!C003701u.A0F(r1129.A00, r1229.A00)) {
                                    arrayList30.add("paymentRequestResponseMessageId");
                                    arrayList = arrayList30;
                                }
                            }
                        }
                    } else if (obj instanceof AnonymousClass0ZP) {
                        AnonymousClass0ZP r1130 = (AnonymousClass0ZP) obj;
                        AnonymousClass0ZP r1230 = (AnonymousClass0ZP) obj2;
                        if (r1130 == r1230) {
                            arrayList = Collections.emptyList();
                        } else {
                            ArrayList arrayList31 = new ArrayList(C002001d.A2D(r1130, r1230, set));
                            arrayList = arrayList31;
                            if (!set.contains("selectListResponseContent")) {
                                arrayList = arrayList31;
                                if (!C006803i.A0q(r1130.A00, r1230.A00)) {
                                    arrayList31.add("selectListResponseContent");
                                    arrayList = arrayList31;
                                }
                            }
                        }
                    } else if (obj instanceof AnonymousClass28A) {
                        AnonymousClass28A r1131 = (AnonymousClass28A) obj;
                        AnonymousClass28A r1231 = (AnonymousClass28A) obj2;
                        if (r1131 == r1231) {
                            arrayList = Collections.emptyList();
                        } else {
                            ArrayList arrayList32 = new ArrayList(C002001d.A2D(r1131, r1231, set));
                            arrayList = arrayList32;
                            if (!set.contains("selectedId")) {
                                arrayList = arrayList32;
                                if (!C003701u.A0F(r1131.A00, r1231.A00)) {
                                    arrayList32.add("selectedId");
                                    arrayList = arrayList32;
                                }
                            }
                        }
                    } else if (obj instanceof C12200hi) {
                        C12200hi r1132 = (C12200hi) obj;
                        C12200hi r1232 = (C12200hi) obj2;
                        if (r1132 == r1232) {
                            arrayList = Collections.emptyList();
                        } else {
                            ArrayList arrayList33 = new ArrayList(C002001d.A2D(r1132, r1232, set));
                            if (!set.contains("selectedIndex") && r1132.A00 != r1232.A00) {
                                arrayList33.add("selectedIndex");
                            }
                            arrayList = arrayList33;
                            if (!set.contains("selectedId")) {
                                arrayList = arrayList33;
                                if (!r1132.A01.equals(r1232.A01)) {
                                    arrayList33.add("selectedId");
                                    arrayList = arrayList33;
                                }
                            }
                        }
                    } else if (obj instanceof AnonymousClass28G) {
                        AnonymousClass28G r1133 = (AnonymousClass28G) obj;
                        AnonymousClass28G r1233 = (AnonymousClass28G) obj2;
                        if (r1133 == r1233) {
                            arrayList = Collections.emptyList();
                        } else {
                            ArrayList arrayList34 = new ArrayList(C002001d.A2D(r1133, r1233, set));
                            arrayList = arrayList34;
                            if (!set.contains("templateInfo")) {
                                arrayList = arrayList34;
                                if (!C006803i.A0q(r1133.A00, r1233.A00)) {
                                    arrayList34.add("templateInfo");
                                    arrayList = arrayList34;
                                }
                            }
                        }
                    } else if (obj instanceof C05490Ot) {
                        arrayList = C002001d.A2D((C05490Ot) obj, (C05490Ot) obj2, set);
                    } else if (obj instanceof AnonymousClass0ZJ) {
                        AnonymousClass0ZJ r1134 = (AnonymousClass0ZJ) obj;
                        AnonymousClass0ZJ r1234 = (AnonymousClass0ZJ) obj2;
                        if (r1134 == r1234) {
                            arrayList = Collections.emptyList();
                        } else {
                            ArrayList arrayList35 = new ArrayList(C002001d.A23(r1134, r1234, set));
                            arrayList = arrayList35;
                            if (!set.contains("revokedMessageId")) {
                                arrayList = arrayList35;
                                if (!C003701u.A0F(r1134.A00, r1234.A00)) {
                                    arrayList35.add("revokedMessageId");
                                    arrayList = arrayList35;
                                }
                            }
                        }
                    } else if (obj instanceof C12160he) {
                        C12160he r1135 = (C12160he) obj;
                        C12160he r1235 = (C12160he) obj2;
                        if (r1135 == r1235) {
                            arrayList = Collections.emptyList();
                        } else {
                            ArrayList arrayList36 = new ArrayList(C002001d.A2A(r1135, r1235, set));
                            arrayList = arrayList36;
                            if (!set.contains("isBlocked")) {
                                arrayList = arrayList36;
                                if (r1135.A00 != r1235.A00) {
                                    arrayList36.add("isBlocked");
                                    arrayList = arrayList36;
                                }
                            }
                        }
                    } else if (obj instanceof C12140hc) {
                        C12140hc r1136 = (C12140hc) obj;
                        C12140hc r1236 = (C12140hc) obj2;
                        if (r1136 == r1236) {
                            arrayList = Collections.emptyList();
                        } else {
                            ArrayList arrayList37 = new ArrayList(C002001d.A2A(r1136, r1236, set));
                            if (!set.contains("deviceAddedCount") && r1136.A00 != r1236.A00) {
                                arrayList37.add("deviceAddedCount");
                            }
                            arrayList = arrayList37;
                            if (!set.contains("deviceRemovedCount")) {
                                arrayList = arrayList37;
                                if (r1136.A01 != r1236.A01) {
                                    arrayList37.add("deviceRemovedCount");
                                    arrayList = arrayList37;
                                }
                            }
                        }
                    } else if (obj instanceof C12240hm) {
                        C12240hm r1137 = (C12240hm) obj;
                        C12240hm r1237 = (C12240hm) obj2;
                        if (r1137 == r1237) {
                            arrayList = Collections.emptyList();
                        } else {
                            ArrayList arrayList38 = new ArrayList(C002001d.A2A(r1137, r1237, set));
                            arrayList = arrayList38;
                            if (!set.contains("ephemeralSettingInSeconds")) {
                                arrayList = arrayList38;
                                if (r1137.A00 != r1237.A00) {
                                    arrayList38.add("ephemeralSettingInSeconds");
                                    arrayList = arrayList38;
                                }
                            }
                        }
                    } else if (obj instanceof C12170hf) {
                        C12170hf r1138 = (C12170hf) obj;
                        C12170hf r1238 = (C12170hf) obj2;
                        if (r1138 == r1238) {
                            arrayList = Collections.emptyList();
                        } else {
                            ArrayList arrayList39 = new ArrayList(C002001d.A2A(r1138, r1238, set));
                            arrayList = arrayList39;
                            if (!set.contains("settingDuration")) {
                                arrayList = arrayList39;
                                if (r1138.A00 != r1238.A00) {
                                    arrayList39.add("settingDuration");
                                    arrayList = arrayList39;
                                }
                            }
                        }
                    } else if (obj instanceof C12230hl) {
                        C12230hl r1139 = (C12230hl) obj;
                        C12230hl r1239 = (C12230hl) obj2;
                        if (r1139 == r1239) {
                            arrayList = Collections.emptyList();
                        } else {
                            ArrayList arrayList40 = new ArrayList(C002001d.A2B(r1139, r1239, set));
                            arrayList = arrayList40;
                            if (!set.contains("ephemeralSettingInSecond")) {
                                arrayList = arrayList40;
                                if (r1139.A00 != r1239.A00) {
                                    arrayList40.add("ephemeralSettingInSecond");
                                    arrayList = arrayList40;
                                }
                            }
                        }
                    } else if (obj instanceof C12100hY) {
                        C12100hY r1140 = (C12100hY) obj;
                        C12100hY r1240 = (C12100hY) obj2;
                        if (r1140 == r1240) {
                            arrayList = Collections.emptyList();
                        } else {
                            ArrayList arrayList41 = new ArrayList(C002001d.A2B(r1140, r1240, set));
                            if (!set.contains("newSubject") && !C003701u.A0F(r1140.A0v(), r1240.A0v())) {
                                arrayList41.add("newSubject");
                            }
                            arrayList = arrayList41;
                            if (!set.contains("oldSubject")) {
                                arrayList = arrayList41;
                                if (!C003701u.A0F(r1140.A01, r1240.A01)) {
                                    arrayList41.add("oldSubject");
                                    arrayList = arrayList41;
                                }
                            }
                        }
                    } else if (obj instanceof C05400Oj) {
                        arrayList = C002001d.A2B((C05400Oj) obj, (C05400Oj) obj2, set);
                    } else if (obj instanceof C12110hZ) {
                        C12110hZ r1141 = (C12110hZ) obj;
                        C12110hZ r1241 = (C12110hZ) obj2;
                        if (r1141 == r1241) {
                            arrayList = Collections.emptyList();
                        } else {
                            ArrayList arrayList42 = new ArrayList(C002001d.A2A(r1141, r1241, set));
                            arrayList = arrayList42;
                            if (!set.contains("verifiedName")) {
                                arrayList = arrayList42;
                                if (!C003701u.A0F(r1141.A00, r1241.A00)) {
                                    arrayList42.add("verifiedName");
                                    arrayList = arrayList42;
                                }
                            }
                        }
                    } else if (obj instanceof C12150hd) {
                        C12150hd r1142 = (C12150hd) obj;
                        C12150hd r1242 = (C12150hd) obj2;
                        if (r1142 == r1242) {
                            arrayList = Collections.emptyList();
                        } else {
                            ArrayList arrayList43 = new ArrayList(C002001d.A2A(r1142, r1242, set));
                            if (!set.contains("privacyProviderCategory") && r1142.A00 != r1242.A00) {
                                arrayList43.add("privacyProviderCategory");
                            }
                            arrayList = arrayList43;
                            if (!set.contains("verifiedBizName")) {
                                arrayList = arrayList43;
                                if (!C003701u.A0F(r1142.A01, r1242.A01)) {
                                    arrayList43.add("verifiedBizName");
                                    arrayList = arrayList43;
                                }
                            }
                        }
                    } else if (obj instanceof C12180hg) {
                        C12180hg r1143 = (C12180hg) obj;
                        C12180hg r1243 = (C12180hg) obj2;
                        if (r1143 == r1243) {
                            arrayList = Collections.emptyList();
                        } else {
                            ArrayList arrayList44 = new ArrayList(C002001d.A2A(r1143, r1243, set));
                            if (!set.contains("transitionId") && r1143.A00 != r1243.A00) {
                                arrayList44.add("transitionId");
                            }
                            arrayList = arrayList44;
                            if (!set.contains("verifiedName")) {
                                arrayList = arrayList44;
                                if (!C003701u.A0F(r1143.A01, r1243.A01)) {
                                    arrayList44.add("verifiedName");
                                    arrayList = arrayList44;
                                }
                            }
                        }
                    } else if (obj instanceof C12130hb) {
                        C12130hb r1144 = (C12130hb) obj;
                        C12130hb r1244 = (C12130hb) obj2;
                        if (r1144 == r1244) {
                            arrayList = Collections.emptyList();
                        } else {
                            ArrayList arrayList45 = new ArrayList(C002001d.A2A(r1144, r1244, set));
                            if (!set.contains("oldJid") && !C006803i.A0q(r1144.A01, r1244.A01)) {
                                arrayList45.add("oldJid");
                            }
                            arrayList = arrayList45;
                            if (!set.contains("newJid")) {
                                arrayList = arrayList45;
                                if (!C006803i.A0q(r1144.A00, r1244.A00)) {
                                    arrayList45.add("newJid");
                                    arrayList = arrayList45;
                                }
                            }
                        }
                    } else if (obj instanceof AnonymousClass2A4) {
                        AnonymousClass2A4 r1145 = (AnonymousClass2A4) obj;
                        AnonymousClass2A4 r1245 = (AnonymousClass2A4) obj2;
                        if (r1145 == r1245) {
                            arrayList = Collections.emptyList();
                        } else {
                            ArrayList arrayList46 = new ArrayList(C002001d.A2C(r1145, r1245, set));
                            if (!set.contains("millisBeforeExpired") && r1145.A00 != r1245.A00) {
                                arrayList46.add("millisBeforeExpired");
                            }
                            if (!set.contains("comaSeparatedWebStubString") && !C003701u.A0F(r1145.A02, r1245.A02)) {
                                arrayList46.add("comaSeparatedWebStubString");
                            }
                            if (!set.contains("amountStringValue") && !C003701u.A0F(r1145.A01, r1245.A01)) {
                                arrayList46.add("amountStringValue");
                            }
                            if (!set.contains("transferDate") && !C003701u.A0F(r1145.A04, r1245.A04)) {
                                arrayList46.add("transferDate");
                            }
                            arrayList = arrayList46;
                            if (!set.contains("paymentSenderDisplayName")) {
                                arrayList = arrayList46;
                                if (!C003701u.A0F(r1145.A03, r1245.A03)) {
                                    arrayList46.add("paymentSenderDisplayName");
                                    arrayList = arrayList46;
                                }
                            }
                        }
                    } else if (obj instanceof AnonymousClass2A5) {
                        AnonymousClass2A5 r1146 = (AnonymousClass2A5) obj;
                        AnonymousClass2A5 r1246 = (AnonymousClass2A5) obj2;
                        if (r1146 == r1246) {
                            arrayList = Collections.emptyList();
                        } else {
                            ArrayList arrayList47 = new ArrayList(C002001d.A2C(r1146, r1246, set));
                            if (!set.contains("newTransactionInfo") && !C003701u.A0F(r1146.A03, r1246.A03)) {
                                arrayList47.add("newTransactionInfo");
                            }
                            if (!set.contains("comaSeparatedTransactionsData") && !C003701u.A0F(r1146.A01, r1246.A01)) {
                                arrayList47.add("comaSeparatedTransactionsData");
                            }
                            if (!set.contains("initTimestamp") && !C003701u.A0F(r1146.A02, r1246.A02)) {
                                arrayList47.add("initTimestamp");
                            }
                            if (!set.contains("updateTimestamp") && !C003701u.A0F(r1146.A04, r1246.A04)) {
                                arrayList47.add("updateTimestamp");
                            }
                            arrayList = arrayList47;
                            if (!set.contains("comaSeparatedAmountData")) {
                                arrayList = arrayList47;
                                if (!C003701u.A0F(r1146.A00, r1246.A00)) {
                                    arrayList47.add("comaSeparatedAmountData");
                                    arrayList = arrayList47;
                                }
                            }
                        }
                    } else if (obj instanceof C05480Os) {
                        arrayList = C002001d.A2C((C05480Os) obj, (C05480Os) obj2, set);
                    } else if (obj instanceof C12120ha) {
                        C12120ha r1147 = (C12120ha) obj;
                        C12120ha r1247 = (C12120ha) obj2;
                        if (r1147 == r1247) {
                            arrayList = Collections.emptyList();
                        } else {
                            ArrayList arrayList48 = new ArrayList(C002001d.A2A(r1147, r1247, set));
                            if (!set.contains("profilePhotoChange") && !C006803i.A0q(r1147.A00, r1247.A00)) {
                                arrayList48.add("profilePhotoChange");
                            }
                            arrayList = arrayList48;
                            if (!set.contains("newPhotoId")) {
                                arrayList = arrayList48;
                                if (!C003701u.A0F(r1147.A0v(), r1247.A0v())) {
                                    arrayList48.add("newPhotoId");
                                    arrayList = arrayList48;
                                }
                            }
                        }
                    } else if (obj instanceof C449922l) {
                        C449922l r1148 = (C449922l) obj;
                        C449922l r1248 = (C449922l) obj2;
                        ArrayList arrayList49 = new ArrayList(C002001d.A23(r1148, r1248, set));
                        if (!set.contains("note") && !C006803i.A0q(r1148.A01, r1248.A01)) {
                            arrayList49.add("note");
                        }
                        if (!set.contains("token") && !C006803i.A0q(r1148.A02, r1248.A02)) {
                            arrayList49.add("token");
                        }
                        arrayList = arrayList49;
                        if (!set.contains("invoiceAttachment")) {
                            arrayList = arrayList49;
                            if (!C006803i.A0q(r1148.A00, r1248.A00)) {
                                arrayList49.add("invoiceAttachment");
                                arrayList = arrayList49;
                            }
                        }
                    } else if (obj instanceof C05390Oi) {
                        arrayList = C002001d.A2A((C05390Oi) obj, (C05390Oi) obj2, set);
                    } else if (obj instanceof AnonymousClass0M3) {
                        arrayList = C002001d.A27((AnonymousClass0M3) obj, (AnonymousClass0M3) obj2, set);
                    } else if (obj instanceof AbstractC007503q) {
                        arrayList = C002001d.A23((AbstractC007503q) obj, (AbstractC007503q) obj2, set);
                    } else {
                        StringBuilder A0S = AnonymousClass008.A0S("cannot find implementation to compare these objects of type: ");
                        A0S.append(cls.getSimpleName());
                        arrayList = Collections.singletonList(A0S.toString());
                    }
                }
                arrayList = Collections.singletonList(str2);
            }
            if (!arrayList.isEmpty()) {
                AnonymousClass0Sj r2 = this.A00;
                String join = TextUtils.join(",", arrayList);
                set.toArray(new String[0]);
                if (r2 != null) {
                    throw new IllegalStateException(AnonymousClass008.A0L(str, " Failed field: ", join));
                }
                throw null;
            }
        }
    }

    public void A05(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2)) {
            A07(str, TextUtils.isEmpty(str3));
        } else {
            A03(str, str2, str3);
        }
    }

    public void A06(String str, List list, List list2, Set set) {
        if (list != list2) {
            if (list == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("expected list is null");
                A00(sb.toString());
                throw null;
            } else if (list2 == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append("actual list is null");
                A00(sb2.toString());
                throw null;
            } else if (list.size() == list2.size()) {
                for (int i = 0; i < list.size(); i++) {
                    A04(str, list.get(i), list2.get(i), set);
                }
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append("list sizes are different");
                A00(sb3.toString());
                throw null;
            }
        }
    }

    public void A07(String str, boolean z) {
        if (!z) {
            A00(str);
            throw null;
        }
    }

    public void A08(String str, byte[] bArr, byte[] bArr2) {
        if (bArr != bArr2 && !Arrays.equals(bArr, bArr2)) {
            A01(str);
            throw null;
        }
    }
}
