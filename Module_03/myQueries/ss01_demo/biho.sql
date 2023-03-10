use ss01_demo;

Create procedure question1
As
Begin
	select MAHANG, TENHANG, DVT
	FROM DMHANG
	WHERE DVT LIKE 'KG'
End;
EXEC question1;

select * from DMHANG
