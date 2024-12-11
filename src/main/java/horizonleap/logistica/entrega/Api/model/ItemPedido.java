package horizonleap.logistica.entrega.Api.model;

import java.util.UUID;

import lombok.Data;

@Data
public class ItemPedido {
    private UUID id;

    private Integer quantidade;

    private Integer idProduto;
}
