/*
 * Copyright © 2020 Tinkoff Bank
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package ru.tinkoff.acquiring.sdk.payment

/**
 * Состояние процесса оплаты
 *
 * @author Mariya Chernyadieva
 */
enum class PaymentState {
    CREATED,
    STARTED,
    STOPPED,
    THREE_DS_DATA_COLLECTING,
    THREE_DS_V2_REJECTED,
    THREE_DS_NEEDED,
    BROWSE_SBP_BANK,
    OPEN_TINKOFF_PAY_BANK,
    CHARGE_REJECTED,
    SUCCESS,
    ERROR
}