package com.whatsapp.protocol;

import X.AnonymousClass02Y;
import X.AnonymousClass0M5;
import X.AnonymousClass0OS;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;

public class ProtocolJniHelper {
    public static final ProtocolJniHelper INSTANCE = new ProtocolJniHelper();

    public Object createKeyValue(String str, String str2, Object obj, byte b) {
        return new AnonymousClass0OS(str, str2, (Jid) obj, b);
    }

    public Object createNewJid(String str) {
        try {
            return Jid.get(str);
        } catch (AnonymousClass02Y e) {
            Log.w("ProtocolJniHelper/createNewJid", e);
            return null;
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:25:0x002a */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:17:0x002a */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: X.0M5[] */
    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: X.0OS[] */
    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: X.0M5[] */
    /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: X.0M5[] */
    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: X.0OS[] */
    /* JADX DEBUG: Multi-variable search result rejected for r2v4, resolved type: X.0OS[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if ((r8[0] instanceof X.AnonymousClass0OS) != false) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object createProtocolTreeNode(java.lang.String r7, java.lang.Object[] r8, java.lang.Object[] r9, byte[] r10) {
        /*
            r6 = this;
            r2 = 1
            r5 = 0
            if (r8 == 0) goto L_0x000b
            r0 = r8[r5]
            boolean r0 = r0 instanceof X.AnonymousClass0OS
            r1 = 0
            if (r0 == 0) goto L_0x000c
        L_0x000b:
            r1 = 1
        L_0x000c:
            if (r9 == 0) goto L_0x0015
            r0 = r9[r5]
            boolean r0 = r0 instanceof X.AnonymousClass0M5
            if (r0 != 0) goto L_0x0015
            r2 = 0
        L_0x0015:
            if (r1 == 0) goto L_0x003e
            if (r2 == 0) goto L_0x003e
            r4 = 0
            if (r8 == 0) goto L_0x0029
            int r3 = r8.length
            X.0OS[] r2 = new X.AnonymousClass0OS[r3]
            r1 = 0
        L_0x0020:
            if (r1 >= r3) goto L_0x002a
            r0 = r8[r1]
            r2[r1] = r0
            int r1 = r1 + 1
            goto L_0x0020
        L_0x0029:
            r2 = r4
        L_0x002a:
            if (r9 == 0) goto L_0x0038
            int r1 = r9.length
            X.0M5[] r4 = new X.AnonymousClass0M5[r1]
        L_0x002f:
            if (r5 >= r1) goto L_0x0038
            r0 = r9[r5]
            r4[r5] = r0
            int r5 = r5 + 1
            goto L_0x002f
        L_0x0038:
            X.0M5 r0 = new X.0M5
            r0.<init>(r7, r2, r4, r10)
            return r0
        L_0x003e:
            java.lang.String r1 = "ProtocolJniHelper/createProtocolTreeNode"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.protocol.ProtocolJniHelper.createProtocolTreeNode(java.lang.String, java.lang.Object[], java.lang.Object[], byte[]):java.lang.Object");
    }

    public Object[] getAttributesFromProtocolTreeNode(Object obj) {
        if (obj instanceof AnonymousClass0M5) {
            return ((AnonymousClass0M5) obj).A0I();
        }
        throw new IllegalArgumentException("ProtocolJniHelper/getAttributesFromProtocolTreeNode");
    }

    public Object[] getChildrenFromProtocolTreeNode(Object obj) {
        if ((obj instanceof AnonymousClass0M5) && obj != null) {
            return ((AnonymousClass0M5) obj).A03;
        }
        throw new IllegalArgumentException("ProtocolJniHelper/getChildrenFromProtocolTreeNode");
    }

    public byte[] getDataFromProtocolTreeNode(Object obj) {
        if (obj instanceof AnonymousClass0M5) {
            return ((AnonymousClass0M5) obj).A01;
        }
        throw new IllegalArgumentException("ProtocolJniHelper/getDataFromProtocolTreeNode");
    }

    public static ProtocolJniHelper getInstance() {
        return INSTANCE;
    }

    public String getKeyFromKeyValue(Object obj) {
        if (obj instanceof AnonymousClass0OS) {
            return ((AnonymousClass0OS) obj).A02;
        }
        throw new IllegalArgumentException("ProtocolJniHelper/getKeyFromKeyValue");
    }

    public String getTagFromProtocolTreeNode(Object obj) {
        if (obj instanceof AnonymousClass0M5) {
            return ((AnonymousClass0M5) obj).A00;
        }
        throw new IllegalArgumentException("ProtocolJniHelper/getTagFromProtocolTreeNode");
    }

    public byte getTypeFromKeyValue(Object obj) {
        if (obj instanceof AnonymousClass0OS) {
            return ((AnonymousClass0OS) obj).A00;
        }
        throw new IllegalArgumentException("ProtocolJniHelper/getTypeFromKeyValue");
    }

    public String getValueStringFromKeyValue(Object obj) {
        if (obj instanceof AnonymousClass0OS) {
            return ((AnonymousClass0OS) obj).A03;
        }
        throw new IllegalArgumentException("ProtocolJniHelper/getValueStringFromKeyValue");
    }
}
