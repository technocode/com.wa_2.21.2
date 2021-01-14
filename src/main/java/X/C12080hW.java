package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Map;
import org.wawebrtc.MediaCodecVideoEncoder;

/* renamed from: X.0hW  reason: invalid class name and case insensitive filesystem */
public class C12080hW {
    public static Map A00;
    public static Map A01;
    public static String[] A02;

    static {
        String[] strArr = new String[MediaCodecVideoEncoder.MIN_ENCODER_WIDTH];
        strArr[0] = null;
        strArr[1] = null;
        strArr[2] = null;
        strArr[3] = "200";
        strArr[4] = "400";
        strArr[5] = "404";
        strArr[6] = "500";
        strArr[7] = "501";
        strArr[8] = "502";
        strArr[9] = "action";
        strArr[10] = "add";
        strArr[11] = "after";
        strArr[12] = "archive";
        strArr[13] = "author";
        strArr[14] = "available";
        strArr[15] = "battery";
        strArr[16] = "before";
        strArr[17] = "body";
        strArr[18] = "broadcast";
        strArr[19] = "chat";
        strArr[20] = "clear";
        strArr[21] = "code";
        strArr[22] = "composing";
        strArr[23] = "contacts";
        strArr[24] = "count";
        strArr[25] = "create";
        strArr[26] = "debug";
        strArr[27] = "delete";
        strArr[28] = "demote";
        strArr[29] = "duplicate";
        strArr[30] = "encoding";
        strArr[31] = "error";
        strArr[32] = "false";
        strArr[33] = "filehash";
        strArr[34] = "from";
        strArr[35] = "g.us";
        strArr[36] = "group";
        strArr[37] = "groups_v2";
        strArr[38] = "height";
        strArr[39] = "id";
        strArr[40] = "image";
        strArr[41] = "in";
        strArr[42] = "index";
        strArr[43] = "invis";
        strArr[44] = "item";
        strArr[45] = "jid";
        strArr[46] = "kind";
        strArr[47] = "last";
        strArr[48] = "leave";
        strArr[49] = "live";
        strArr[50] = "log";
        strArr[51] = "media";
        strArr[52] = "message";
        strArr[53] = "mimetype";
        strArr[54] = "missing";
        strArr[55] = "modify";
        strArr[56] = "name";
        strArr[57] = "notification";
        strArr[58] = "notify";
        strArr[59] = "out";
        strArr[60] = "owner";
        strArr[61] = "participant";
        strArr[62] = "paused";
        strArr[63] = "picture";
        strArr[64] = "played";
        strArr[65] = "presence";
        strArr[66] = "preview";
        strArr[67] = "promote";
        strArr[68] = "query";
        strArr[69] = "raw";
        strArr[70] = "read";
        strArr[71] = "receipt";
        strArr[72] = "received";
        strArr[73] = "recipient";
        strArr[74] = "recording";
        strArr[75] = "relay";
        strArr[76] = "remove";
        strArr[77] = "response";
        strArr[78] = "resume";
        strArr[79] = "retry";
        strArr[80] = "s.whatsapp.net";
        strArr[81] = "seconds";
        strArr[82] = "set";
        strArr[83] = "size";
        strArr[84] = "status";
        strArr[85] = "subject";
        strArr[86] = "subscribe";
        strArr[87] = "t";
        strArr[88] = "text";
        strArr[89] = "to";
        strArr[90] = "true";
        strArr[91] = "type";
        strArr[92] = "unarchive";
        strArr[93] = "unavailable";
        strArr[94] = "url";
        strArr[95] = "user";
        strArr[96] = "value";
        strArr[97] = "web";
        strArr[98] = "width";
        strArr[99] = "mute";
        strArr[100] = "read_only";
        strArr[101] = "admin";
        strArr[102] = "creator";
        strArr[103] = "short";
        strArr[104] = "update";
        strArr[105] = "powersave";
        strArr[106] = "checksum";
        strArr[107] = "epoch";
        strArr[108] = "block";
        strArr[109] = "previous";
        strArr[110] = "409";
        strArr[111] = "replaced";
        strArr[112] = "reason";
        strArr[113] = "spam";
        strArr[114] = "modify_tag";
        strArr[115] = "message_info";
        strArr[116] = "delivery";
        strArr[117] = "emoji";
        strArr[118] = "title";
        strArr[119] = "description";
        strArr[120] = "canonical-url";
        strArr[121] = "matched-text";
        strArr[122] = "star";
        strArr[123] = "unstar";
        strArr[124] = "media_key";
        strArr[125] = "filename";
        strArr[126] = "identity";
        strArr[127] = "unread";
        strArr[128] = "page";
        strArr[129] = "page_count";
        strArr[130] = "search";
        strArr[131] = "media_message";
        strArr[132] = "security";
        strArr[133] = "call_log";
        strArr[134] = "profile";
        strArr[135] = "ciphertext";
        strArr[136] = "invite";
        strArr[137] = "gif";
        strArr[138] = "vcard";
        strArr[139] = "frequent";
        strArr[140] = "privacy";
        strArr[141] = "blacklist";
        strArr[142] = "whitelist";
        strArr[143] = "verify";
        strArr[144] = "location";
        strArr[145] = "document";
        strArr[146] = "elapsed";
        strArr[147] = "revoke_invite";
        strArr[148] = "expiration";
        strArr[149] = "unsubscribe";
        strArr[150] = "disable";
        strArr[151] = "vname";
        strArr[152] = "old_jid";
        strArr[153] = "new_jid";
        strArr[154] = "announcement";
        strArr[155] = "locked";
        strArr[156] = "prop";
        strArr[157] = "label";
        strArr[158] = "color";
        strArr[159] = "call";
        strArr[160] = "offer";
        strArr[161] = "call-id";
        strArr[162] = "quick_reply";
        strArr[163] = "sticker";
        strArr[164] = "pay_t";
        strArr[165] = "accept";
        strArr[166] = "reject";
        strArr[167] = "sticker_pack";
        strArr[168] = "invalid";
        strArr[169] = "canceled";
        strArr[170] = "missed";
        strArr[171] = "connected";
        strArr[172] = "result";
        strArr[173] = "audio";
        strArr[174] = "video";
        strArr[175] = "recent";
        A02 = strArr;
    }

    public static int A00(int i, int i2) {
        int i3 = 0;
        int i4 = -1;
        int i5 = -1;
        while (true) {
            int[] iArr = C12090hX.A00;
            if (i3 < iArr.length) {
                if (iArr[i3] == i) {
                    i4 = i3;
                }
                if (iArr[i3] == i2) {
                    i5 = i3;
                }
                if (i4 != -1 && i5 != -1) {
                    break;
                }
                i3++;
            } else {
                break;
            }
        }
        if (i4 < i5) {
            return -1;
        }
        if (i4 > i5) {
            return 1;
        }
        return 0;
    }

    public static String A01(boolean z, int i, int i2) {
        if (!z) {
            return C64332y1.A00[i2];
        }
        try {
            return C64332y1.A01[i - 236][i2];
        } catch (ArrayIndexOutOfBoundsException e) {
            StringBuilder sb = new StringBuilder("Fail while trying to access WapDict, dictNum=");
            sb.append(i);
            sb.append(", dictIdx=");
            sb.append(i2);
            Log.e(sb.toString());
            throw e;
        }
    }

    public static synchronized void A02() {
        synchronized (C12080hW.class) {
            if (A00 == null) {
                HashMap hashMap = new HashMap();
                int i = 0;
                while (true) {
                    String[] strArr = C64332y1.A00;
                    if (i >= strArr.length) {
                        break;
                    }
                    String str = strArr[i];
                    if (!TextUtils.isEmpty(str)) {
                        hashMap.put(str, new C64202xn(false, 0, i));
                    }
                    i++;
                }
                int i2 = 0;
                while (true) {
                    String[][] strArr2 = C64332y1.A01;
                    if (i2 >= strArr2.length) {
                        break;
                    }
                    String[] strArr3 = strArr2[i2];
                    for (int i3 = 0; i3 < strArr3.length; i3++) {
                        String str2 = strArr3[i3];
                        if (!TextUtils.isEmpty(str2)) {
                            hashMap.put(str2, new C64202xn(true, i2 + 236, i3));
                        }
                    }
                    i2++;
                }
                HashMap hashMap2 = new HashMap();
                int i4 = 0;
                while (true) {
                    String[] strArr4 = A02;
                    if (i4 < strArr4.length) {
                        String str3 = strArr4[i4];
                        if (!TextUtils.isEmpty(str3)) {
                            hashMap2.put(str3, new C64202xn(false, -1, i4));
                        }
                        i4++;
                    } else {
                        A01 = hashMap2;
                        A00 = hashMap;
                        return;
                    }
                }
            }
        }
    }
}
