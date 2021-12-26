int main()
{
    int N = 6;
    int arr [N]{3,3,2,1,1,5};
    int index = arr[0];
    int max_count = 1;
    for (int elm = 0; elm<(N-1); elm++)
    {
        int count = 1;
        for (int i = elm+1; i<N; i++)
            {
                if (arr[elm] == arr [i])
                count++;
            }
        if (count>=max_count&&index>arr[elm])
            {
                max_count = count;
                index = arr[elm];
            }
    }
    if (max_count > 1)
        cout<<max_count<<" раз(а) встречается число "<<index<<endl;
    else
        cout<<"Все элементы различны!";

    return 0;
}
