/*
 * PHR_jquerywidget
 *
 * Copyright (C) 1999-2013 Photon Infotech Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/*global define, $, window */
   
define( "eshop/widgets/ShoppingCartBootstrap", [ "jquery", "eshop/widgets/ShoppingCart" ], function($, ShoppingCart) {

    function ShoppingCartBootstrap() {
    }

    ShoppingCartBootstrap.prototype.container = undefined;
    ShoppingCartBootstrap.prototype.shoppingCartWidget = undefined;

    ShoppingCartBootstrap.prototype.init = function(listener, api, phrescoapi) {
        this.container =  $("eshop\\:shoppingcart-widget");

        if(this.container !== null ) {
            this.shoppingCartWidget = new ShoppingCart();
            this.shoppingCartWidget.initialize(this.container, listener, phrescoapi, api);
            this.shoppingCartWidget.render(this.container);
        }
    };

    return ShoppingCartBootstrap;
});