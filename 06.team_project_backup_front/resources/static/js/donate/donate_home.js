  function selectBusiness(donateCode){
      let f = document.createElement('form');

      let obj;
      obj = document.createElement('input');
      obj.setAttribute('name', 'donateBusinessCode');
      obj.setAttribute('value', donateCode);

      f.appendChild(obj);
      f.setAttribute('method', 'get');
      f.setAttribute('action', 'donatecreate');

      document.body.appendChild(f);
      f.submit();
  }
