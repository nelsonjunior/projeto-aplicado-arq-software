package br.com.projetoaplicado.notificacao.exception.handler

import br.com.projetoaplicado.comum.util.exception.handler.ResponseExceptionHandler
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.RestController

@ControllerAdvice
@RestController
class NotificacaoResponseHandler : ResponseExceptionHandler()