package horizonleap.logistica.entrega.Api.Consumer;

import java.util.function.Consumer;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import horizonleap.logistica.entrega.Api.model.dadosPedidoConcluido;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@AllArgsConstructor
public class PedidoFeitoConsumer {

    @Bean
    public Consumer<dadosPedidoConcluido> pedidoConcluido(){
        return pedido -> {
            log.info("pedido recebido");
            log.info("Pedido para o cliente " + pedido.getNomeCliente());
            log.info("Enviar para " + pedido.getEndereco());
        };
    }

}
