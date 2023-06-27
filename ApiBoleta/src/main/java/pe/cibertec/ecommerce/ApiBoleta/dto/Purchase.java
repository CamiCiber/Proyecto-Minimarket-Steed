/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.ecommerce.ApiBoleta.dto;

import java.util.Set;
import lombok.Getter;
import lombok.Setter;
import pe.cibertec.ecommerce.ApiBoleta.entity.Receipt;
import pe.cibertec.ecommerce.ApiBoleta.entity.ReceiptDetail;

@Getter
@Setter
public class Purchase {
    Receipt receipt;
    Set<ReceiptDetail> receiptDetails;}
