INSERT INTO ecms.sys_org_info(
id,
orgname,
orgnum,
upid,
ordernum,
linkman,
phonenum,
orgadress,
remark,
stat,
by2,
by3,
by4,
by5,
by6,
sfkwd,
bkwdyy,
jgsfcq,
ssfh,
orgadressnum,
kind,
windownum,
standard,
cityno,
districtno,
resttime,
resttimenotice,
worktimenotice,
longitude,
latitude,
jshzg
)
SELECT 
branchno, 
branchname,  -- ��������
zoneno,      -- ���б��
zlvlcode,   -- �����㼶����
branchtype,   -- ��������
NAME,  --  ��ϵ��
tel,  -- �绰
address, -- ��ַ
note1,     --  ��ע1
clearflag,-- �����ʶ
branchlevel,-- ���㼶��
zcbrdes, -- �������
zipcode,-- �ʱ�
startteller1, -- ������Ա1
startteller2, -- ������Ա2
selfauditflag, -- ���������־
zbrct, -- ��������������
region, -- ����
zcbrdes, -- �������
zipcode, -- �ʱ�
STATUS, -- ����״̬
note1, -- ��ע1
note2, -- ������Ȩ Զ����Ȩ
brcity, -- ����
region, -- ����
clearflag, -- �����ʶ
tel2, -- �绰2
tel3, -- �绰3
zreppath, -- ����㼶·��
zclrpath, -- ����㼶·��
note3 -- ���֤�˲�ģʽ
FROM  sirotestdb.ecms_branch_info t WHERE t.branchno !='' 