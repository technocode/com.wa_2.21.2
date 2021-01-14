package com.whatsapp.protocol;

import X.AnonymousClass0M5;
import X.AnonymousClass0OS;
import com.whatsapp.jid.Jid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VoipStanzaChildNode {
    public final AnonymousClass0OS[] attributes;
    public final VoipStanzaChildNode[] children;
    public final byte[] data;
    public final String tag;

    public VoipStanzaChildNode(String str, AnonymousClass0OS[] r2, VoipStanzaChildNode[] voipStanzaChildNodeArr, byte[] bArr) {
        this.tag = str;
        this.attributes = r2;
        this.children = voipStanzaChildNodeArr;
        this.data = bArr;
    }

    public static VoipStanzaChildNode fromProtocolTreeNode(AnonymousClass0M5 r7) {
        VoipStanzaChildNode[] voipStanzaChildNodeArr;
        AnonymousClass0M5[] r6 = r7.A03;
        if (r6 != null) {
            int length = r6.length;
            voipStanzaChildNodeArr = new VoipStanzaChildNode[length];
            int i = 0;
            int i2 = 0;
            while (i < length) {
                voipStanzaChildNodeArr[i2] = fromProtocolTreeNode(r6[i]);
                i++;
                i2++;
            }
        } else {
            voipStanzaChildNodeArr = null;
        }
        return new VoipStanzaChildNode(r7.A00, r7.A0I(), voipStanzaChildNodeArr, r7.A01);
    }

    public AnonymousClass0OS[] getAttributesCopy() {
        AnonymousClass0OS[] r1 = this.attributes;
        if (r1 != null) {
            return (AnonymousClass0OS[]) Arrays.copyOf(r1, r1.length);
        }
        return null;
    }

    public Object[] getAttributesFlattedCopy() {
        AnonymousClass0OS[] r7 = this.attributes;
        if (r7 == null) {
            return null;
        }
        int length = r7.length;
        Object[] objArr = new Object[(length << 1)];
        int i = 0;
        for (AnonymousClass0OS r3 : r7) {
            int i2 = i + 1;
            objArr[i] = r3.A02;
            Jid jid = r3.A01;
            if (jid != null) {
                i = i2 + 1;
                objArr[i2] = jid;
            } else {
                i = i2 + 1;
                objArr[i2] = r3.A03;
            }
        }
        return objArr;
    }

    public VoipStanzaChildNode[] getChildrenCopy() {
        VoipStanzaChildNode[] voipStanzaChildNodeArr = this.children;
        if (voipStanzaChildNodeArr != null) {
            return (VoipStanzaChildNode[]) Arrays.copyOf(voipStanzaChildNodeArr, voipStanzaChildNodeArr.length);
        }
        return null;
    }

    public byte[] getDataCopy() {
        byte[] bArr = this.data;
        if (bArr != null) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        return null;
    }

    public String getTag() {
        return this.tag;
    }

    public AnonymousClass0M5 toProtocolTreeNode() {
        AnonymousClass0M5[] r4;
        int length;
        byte[] bArr = this.data;
        if (bArr != null) {
            return new AnonymousClass0M5(this.tag, this.attributes, null, bArr);
        }
        VoipStanzaChildNode[] voipStanzaChildNodeArr = this.children;
        if (voipStanzaChildNodeArr == null || (length = voipStanzaChildNodeArr.length) <= 0) {
            r4 = null;
        } else {
            r4 = new AnonymousClass0M5[length];
            int i = 0;
            int i2 = 0;
            while (i < length) {
                r4[i2] = voipStanzaChildNodeArr[i].toProtocolTreeNode();
                i++;
                i2++;
            }
        }
        return new AnonymousClass0M5(this.tag, this.attributes, r4, null);
    }

    public class Builder {
        public Map attributes;
        public List children;
        public byte[] data;
        public final String tag;

        public Builder(String str) {
            this.tag = str;
        }

        private Builder addAttribute(String str, AnonymousClass0OS r4) {
            Map map = this.attributes;
            if (map == null) {
                map = new HashMap();
                this.attributes = map;
            }
            if (map.put(str, r4) == null) {
                return this;
            }
            throw new IllegalArgumentException("node may not have duplicate attributes");
        }

        public Builder addAttribute(String str, Jid jid) {
            addAttribute(str, new AnonymousClass0OS(str, jid));
            return this;
        }

        public Builder addAttribute(String str, String str2) {
            addAttribute(str, new AnonymousClass0OS(str, str2, null, (byte) 0));
            return this;
        }

        public Builder addAttributes(AnonymousClass0OS[] r5) {
            if (r5 != null) {
                for (AnonymousClass0OS r0 : r5) {
                    addAttribute(r0.A02, r0.A03);
                }
            }
            return this;
        }

        public Builder addChild(VoipStanzaChildNode voipStanzaChildNode) {
            if (this.data == null) {
                List list = this.children;
                if (list == null) {
                    list = new ArrayList();
                    this.children = list;
                }
                list.add(voipStanzaChildNode);
                return this;
            }
            throw new IllegalArgumentException("node may not have both data and children");
        }

        public Builder addChildren(VoipStanzaChildNode[] voipStanzaChildNodeArr) {
            if (voipStanzaChildNodeArr != null) {
                for (VoipStanzaChildNode voipStanzaChildNode : voipStanzaChildNodeArr) {
                    addChild(voipStanzaChildNode);
                }
            }
            return this;
        }

        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:14:0x0030 */
        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: X.0OS[] */
        /* JADX DEBUG: Multi-variable search result rejected for r5v1, resolved type: X.0OS[] */
        /* JADX DEBUG: Multi-variable search result rejected for r5v2, resolved type: X.0OS[] */
        /* JADX WARN: Multi-variable type inference failed */
        public VoipStanzaChildNode build() {
            AnonymousClass0OS[] r5;
            int size;
            Map map = this.attributes;
            VoipStanzaChildNode[] voipStanzaChildNodeArr = null;
            if (map == null || (size = map.size()) <= 0) {
                r5 = 0;
            } else {
                r5 = new AnonymousClass0OS[size];
                int i = 0;
                for (Map.Entry entry : this.attributes.entrySet()) {
                    r5[i] = entry.getValue();
                    i++;
                }
            }
            List list = this.children;
            if (list != null) {
                voipStanzaChildNodeArr = (VoipStanzaChildNode[]) list.toArray(new VoipStanzaChildNode[0]);
            }
            return new VoipStanzaChildNode(this.tag, r5, voipStanzaChildNodeArr, this.data);
        }

        public Builder setData(byte[] bArr) {
            if (this.children == null) {
                this.data = bArr;
                return this;
            }
            throw new IllegalArgumentException("node may not have both data and children");
        }
    }
}
