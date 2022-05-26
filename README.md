# SalesInvoiceGenerator

This project required to create a "Sales Invoice Generator" using Java.

A sales invoice is an accounting document that records a business transaction. It provides the business with a record of the services they’ve provided to a client, when the services were rendered and how much money the client owes the business.

Typically, a sales invoice will include a description of the service provided and the amount owed. Sales invoices are crucial to small-business accounting because they enable you to record transactions of your sales for bookkeeping purposes.


# Project Requirements:
Application have the following features:

1) Sales Invoice Generator (SIG) App displays a table for a preview of all the available invoices and another table for each detailed invoice whenever selected.
2) SIG App displays the invoices table that shows: Invoice No., Invoice Date, Customer Name, and the Total amount of the invoice in the table that shows a preview of every invoice.
3) SIG App displays the detailed invoice in a table that shows: Invoice No., Invoice Date, Customer Name, Invoice Total amount, and all the Invoice Items.
4) SIG App have a "Create New Invoice" Button and "Delete Invoice" button for creating new invoices and deleting an existing one whenever selected.
5) SIG App allows the user to edit and save changes on any selected invoice by having a "Save" button to save changes and a "Cancel button" to discard changes.
6) SIG App shall abide by the provided GUI.
7) The sales invoice shall follow the provided information in the Invoice Header (or Invoice preview) and Invoice table (or Detailed Invoice) that has the details of the invoice.
7) SIG App have the ability to save the latest status, i.e. the latest created/changed/deleted invoices, with a "Save File" button.
8) SIG App have the ability to load the latest saved status, i.e. the latest created/changed/deleted invoices, with a "Load File" button.
9) SIG App initially have pre-read invoices that display upon initial booting/starting.


# The project consists of
1) Big Package: com.salesinvoicesgenerator

- Dialogs: represents dialogs that appears for "Create New Invoice Button" or "Create New Line Button".

- JFrame: defines the main JFrame including the JPanels, JButtons, JMenuBar & JMenuItems of the project.

- Main: contains the main class & main method.

- Tables: contains both table classes.
