package com.student.librarymanagement.rest;
import com.student.librarymanagement.entity.Admin;
import com.student.librarymanagement.entity.AdminName;
import com.student.librarymanagement.entity.Book;
import com.student.librarymanagement.entity.Record;
import com.student.librarymanagement.service.AdminNameService;
import com.student.librarymanagement.service.AdminService;
import com.student.librarymanagement.service.BookService;
import com.student.librarymanagement.service.RecordService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "*")
public class LibraryRestController {

    private AdminService adminService;

    private AdminNameService adminNameService;

    private BookService bookService;

    private RecordService recordService;

    public LibraryRestController(AdminService adminService, AdminNameService adminNameService, BookService bookService, RecordService recordService) {
        this.adminService = adminService;
        this.adminNameService = adminNameService;
        this.bookService = bookService;
        this.recordService = recordService;
    }

    @PostMapping("/addAdmin")
    public Admin addAdmin(@RequestBody Admin admin){
        adminService.saveAdmin(admin);
        return admin;
    }

    @PostMapping("/isAdmin")
    public boolean getAdmin(@RequestBody Admin admin){
        return adminService.getAdmin(admin.getEmail());
    }

    @PostMapping("/addAdminName")
    public AdminName addAdminName(@RequestBody AdminName adminName){
        adminNameService.saveAdminName(adminName);
        return adminName;
    }

    @PostMapping("/adminName")
    public AdminName getAdminName(@RequestBody AdminName adminName){
        return adminNameService.getAdminName(adminName.getEmail());
    }

    @PostMapping("/addBook")
    public Book addBook(@RequestBody Book book){
        return bookService.saveBook(book);
    }

    @GetMapping("/book")
    public List<Book> getBooks(){
        return  bookService.getBookList();
    }

    @PatchMapping("/updateBook/{id}")
    public Book updateBook(@PathVariable Integer id, @RequestBody Book book){
        book.setId(id);
        return bookService.saveBook(book);
    }

    @GetMapping("/record")
    public List<Record> recordList(){
        return recordService.recordList();
    }

    @PostMapping("/addRecord")
    public Record addRecord(@RequestBody Record record){
        return recordService.saveRecord(record);
    }

    @PatchMapping("/updateRecord/{id}")
    public Record updateRecord(@PathVariable Integer id, @RequestBody Record record){
        record.setId(id);
        return recordService.saveRecord(record);
    }

    @GetMapping("/record/{id}")
    public Record getRecord(@PathVariable Integer id){
        return recordService.getById(id);
    }
}
