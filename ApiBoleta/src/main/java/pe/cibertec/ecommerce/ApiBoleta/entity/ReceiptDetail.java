    package pe.cibertec.ecommerce.ApiBoleta.entity;

    import jakarta.persistence.Embedded;
    import jakarta.persistence.Entity;
    import jakarta.persistence.GeneratedValue;
    import jakarta.persistence.GenerationType;
    import jakarta.persistence.Id;
    import jakarta.persistence.JoinColumn;
    import jakarta.persistence.ManyToOne;
    import java.math.BigDecimal;
    import lombok.Getter;
    import lombok.Setter;


    @Entity
    @Getter
    @Setter
    public class ReceiptDetail {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long receiptDetailId;

        @Embedded
        private Product product;
        private BigDecimal discount;
        private BigDecimal quantity;
        private BigDecimal subtotal;

        @ManyToOne
        @JoinColumn(name = "receiptId")
        private Receipt receipt;

    }
