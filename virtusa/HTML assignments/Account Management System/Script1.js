// JavaScript source code
var ExcelApp = new ActiveXObject("Excel.Application");
var ExcelSheet =new ActiveXObject("Excel.Sheet");
// a text is stored in the first cell  
ExcelSheet.ActiveSheet.Cells(1, 1).Value = "Texto1";
// the sheet is saved
ExcelSheet.SaveAs("D:\\TEST.XLS");
// close Excel with the Quit() method of the Application object 
ExcelSheet.Application.Quit();
console.log("Hello")